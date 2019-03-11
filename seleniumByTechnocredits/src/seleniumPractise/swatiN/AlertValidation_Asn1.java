package seleniumPractise.swatiN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

//To validate the alert text with values entered in fields
public class AlertValidation_Asn1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Basic Elements']")).click();

		Thread.sleep(1000);

		WebElement element1 = driver.findElement(By.xpath("//input[@id='UserFirstName']"));
		WebElement element2 = driver.findElement(By.xpath("//input[@id='UserLastName'][@name='ulname']"));
		WebElement element3 = driver.findElement(By.xpath("//input[@id='UserCompanyName'][@name='cmpname']"));
		element1.sendKeys("Swati");
		String firstname = element1.getAttribute("value");
		System.out.println("a is" + firstname);
		element2.sendKeys("Nawalekar");
		String lastname = element2.getAttribute("value");
		element3.sendKeys("eClerx");
		String compname = element3.getAttribute("value");

		driver.findElement(By.xpath("//button[text()='Submit']|//button[@class='btn btn-primary']")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);

		String expected = firstname + " and " + lastname + " and " + compname;
		System.out.println("expected text is" + expected);
		if (alertText.equals(expected)) {
			System.out.println("Text matched");
		}
	}
}
