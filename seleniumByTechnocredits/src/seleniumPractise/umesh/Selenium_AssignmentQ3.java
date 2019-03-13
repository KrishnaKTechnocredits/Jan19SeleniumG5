package seleniumPractise.umesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class Selenium_AssignmentQ3 {
	public static void main(String[] args) throws InterruptedException {
		javaScriptConfirmationMessageCapture();
	}

	static void javaScriptConfirmationMessageCapture() throws InterruptedException {
		// Initialize Chrome Driver
		WebDriver driver = Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Basic Elements']")).click();
		Thread.sleep(400);
		// element storing xpath for Javascript confirmation button
		WebElement element = driver.findElement(By.xpath("//div[@class='row'][2]//following::button[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		element.click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept(); // clicked on Ok on alert
		String actualmsg = driver.findElement(By.xpath("//*[contains(@id,'pgraphdemo')]")).getText();
		String expectedmsg = "You pressed OK!";
		System.out.println("Actual message for OK is: " + actualmsg);
		System.out.println("Actual message for OK is: " + expectedmsg);
		if (expectedmsg.equals(actualmsg))
			System.out.println("Message on OK button is Matched");
			Thread.sleep(2000);
		// again clicked on Javascript confirmation button
		element.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss(); // clicked on cancel on alert button
		String dismiss_msg = driver.findElement(By.xpath("//p[contains(text(),'You pressed Cancel!')]")).getText();
		String expectedmsg2 = "You pressed Cancel!";
		System.out.println("Actual message for Cancel is: " + dismiss_msg);
		System.out.println("Expected message for Cancel is: " + expectedmsg2);
		if (expectedmsg2.equals(dismiss_msg))
			System.out.println("Message on Cancel button is Matched");
		driver.close();
	}
}