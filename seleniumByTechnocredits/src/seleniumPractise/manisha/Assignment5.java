package seleniumPractise.manisha;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;
import util.PropFileOperation;

public class Assignment5 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=Init.initChromeDriver();
		driver.get("http://automationbykrishna.com");
		System.out.println("opened page");
		driver.findElement(By.linkText("Registration")).click();
		System.out.println("On registration page");
		Thread.sleep(2000);
	Properties prop= PropFileOperation.loadProp();
		String username=prop.getProperty("email");
		String password= prop.getProperty("password");
		driver.findElement(By.xpath("//input[@id='unameSignin']")).sendKeys(username);
		System.out.println("username filled");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pwdSignin']")).sendKeys(password);
		System.out.println("password filled");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnsubmitdetails']")).click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		String s1=alert.getText();
		System.out.println("Message on alert pop up is "+ s1);
		alert.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
