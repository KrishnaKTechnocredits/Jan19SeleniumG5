package seleniumPractise.umesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class Selenium_AssignmentQ4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		Thread.sleep(1000);
		// clicked on basic elements button
		driver.findElement(By.xpath("//a[text()='Basic Elements']")).click();
		Thread.sleep(2000);
		// element stores xpath for Javascript prompt button
		WebElement element = driver.findElement(By.xpath("//div[@class='col-lg-12']//button[@id='javascriptPromp']"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(1000);
		element.click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(5000);
		String name = "Umesh Panse";
		alert1.sendKeys(name);
		Thread.sleep(5000);
		alert1.accept();
		String actualOK = driver.findElement(By.xpath("//p[@id='pgraphdemo']")).getText();
		String expectedOK = "Hello " + name + "! How are you today?";
		System.out.println("Expected message: " + expectedOK);
		System.out.println("Actual message: " + actualOK);
		if (expectedOK.equals(actualOK))
			System.out.println("Message match on click of Ok button");
				// again clicked on Javascript prompt button
		driver.findElement(By.xpath("//div[@class='col-lg-12']//button[@id='javascriptPromp']")).click();
		Thread.sleep(1000);
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert2.sendKeys(name);
		Thread.sleep(1000);
		alert2.dismiss();
		Thread.sleep(2000);
		String actualCancel = driver.findElement(By.xpath("//p[@id='pgraphdemo']")).getText();
		String expectedCancel = "User cancelled the prompt.";
		System.out.println("Expected message: " + expectedCancel);
		System.out.println("Actual message: " + actualCancel);
		if (expectedCancel.equals(actualCancel))
			System.out.println("Message match on click of Cancel button");
		driver.close();
	}
}
