package seleniumPractise.umesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class Selenium_AssignmentQ5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		Thread.sleep(1000);
		// clicked on registration page
		driver.findElement(By.xpath("//a[@id='registration2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='unameSignin']")).sendKeys("Umesh");
		Thread.sleep(2000);
		// Password less than 8 characters
		String password = "Abc1234";
		WebElement element = driver.findElement(By.xpath("//input[@id='pwdSignin']"));
		element.sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnsubmitdetails']")).click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		String actualtextp0 = alert1.getText();
		String expectedtexp0 = "Failed! please enter password";
		if (password.length() >= 8) {
			if (actualtextp0.equals(expectedtexp0)) {
				System.out.println("Failed Message is: " + actualtextp0);
				Thread.sleep(500);
			}
		}
		Thread.sleep(500);
		alert1.accept();
		element.clear();
		Thread.sleep(5000);
		// Verify password is >8 characters
		String password3 = "Abc@12345";
		element.sendKeys(password3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnsubmitdetails']")).click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		String actualtextp9 = alert2.getText();
		Thread.sleep(2000);
		String expectedtexp9 = "Success!";
		if (password3.length() > 8) {
			if (actualtextp9.equals(expectedtexp9)) {
				System.out.println("Success Message is: " + actualtextp9);
			}
		}
		alert2.accept();
		driver.close();
	}
}
