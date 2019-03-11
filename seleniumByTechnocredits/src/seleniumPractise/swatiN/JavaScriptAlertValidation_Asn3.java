package seleniumPractise.swatiN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

//Check Alert message on clicking Ok or cancel button
public class JavaScriptAlertValidation_Asn3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Basic Elements']")).click();
		WebElement element = driver
				.findElement(By.xpath("//button[@class='btn btn-warning'][@id='javascriptConfirmBox']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		System.out.println("scrolled successfully");
		element.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		boolean flag = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).isDisplayed();
		if (flag == true) {
			System.out.println("Value is displayed correctly on accepting OK");
		}
	}

}
