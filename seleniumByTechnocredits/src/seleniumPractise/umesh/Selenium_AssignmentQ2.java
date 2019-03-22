package seleniumPractise.umesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class Selenium_AssignmentQ2 {
	public static void main(String[] args) throws InterruptedException {
		javaAlertMessageCapture();
	}

	static void javaAlertMessageCapture() throws InterruptedException {
		// Initialize Chrome Driver
		WebDriver driver = Init.initChromeDriver();
		// launch to base URL
		driver.get("http://www.automationbykrishna.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Basic')]")).click();
		System.out.println("Clicked on Basic Element Section");
		Thread.sleep(2000);
		// User scrolled to Alert button
		WebElement scroll = driver.findElement(By.xpath("//button[@id='javascriptAlert']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		Thread.sleep(2000);
		String expected = "You must be TechnoCredits student!!";
		scroll.click();
		System.out.println("User clicked on Alert button");
		Thread.sleep(2000);
		// User handle alert message
		Alert alert = driver.switchTo().alert();
		String actual = alert.getText();
		System.out.println("Expected Message is:" + expected);
		System.out.println("Actual Message is:" + actual);
		if (expected.equals(actual)) {
			System.out.println("String is Matched");
		} else {
			System.out.println("String is not  Matched");
		}
		alert.accept();
		System.out.println("User accepted the alert message");
		driver.close();
	}
}
