package seleniumPractise.swatiN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;
//Validating Alert msg with Name
public class JavaScriptPrompt_Asn4 {
	public static void main(String[] args) throws InterruptedException {

		String name = "Swati";
		WebDriver driver = Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Basic Elements']")).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//button[@id='javascriptPromp']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		System.out.println("scrolled successfully");
		element.click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(name);
		alert.accept();
		WebElement element2 = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String displayedtext = element2.getText();

		if (displayedtext.equals("Hello" + " " + name + "! How are you today?")) {
			System.out.println("correct msg is displayed");
		} else {
			System.out.println("incorrect msg is displayed");
		}

	}
}