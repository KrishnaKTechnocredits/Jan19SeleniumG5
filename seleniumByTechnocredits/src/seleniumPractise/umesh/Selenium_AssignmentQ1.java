package seleniumPractise.umesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Selenium_AssignmentQ1 {
	public static void main(String[] args) throws InterruptedException {
		basicElementDetails();
	}
	static void basicElementDetails() throws InterruptedException {
		WebDriver driver = Init.initChromeDriver();
		driver.get("http://www.automationbykrishna.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Basic')]")).click();
		System.out.println("Clicked on Basic Element Section");
		Thread.sleep(2000);
		// Enter user details under Alert demo section
		driver.findElement(By.xpath("//input[@id='UserFirstName']")).sendKeys("Umesh");
		System.out.println("User Entered First Name");
		driver.findElement(By.xpath("//input[@id='UserLastName']")).sendKeys("Panse");
		System.out.println("User Entered last Name");
		driver.findElement(By.xpath("//input[@name='cmpname']")).sendKeys("Cognizant");
		System.out.println("User Entered Company Name");
		driver.findElement(By
				.xpath("//section[@class='panel']/header[text()=' Alert Demo ']//following-sibling::div/div[4]/button[@type='submit']"))
				.click();
		Thread.sleep(2000);
		System.out.println("User Clicked on Submit button");
		String expected= "Umesh and Panse and Cognizant";
		// User handle Alert Pop up
		Alert alert = driver.switchTo().alert();
		String actual = alert.getText();
		// Displaying alert message
		System.out.println("Actual Message on Alert Pop up is:" + actual);
		System.out.println("Expected Message is:"+expected);
		if(expected.equals(actual))
		{
			System.out.println("String is Matched");
		}
		else
		{
			System.out.println("String is not Matched");
		}
		// Accepting alert
		alert.accept();
		System.out.println("User Accepted the Alert Pop up message");
	}
}
