package seleniumPractise.kunal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;
public class Kunal_Question3
{
public static void main(String[] args) throws InterruptedException {
	  WebDriver driver= Init.initChromeDriver();
	driver.get("http://automationbykrishna.com/#");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Basic Elements")).click();
	System.out.println("on basic elements page");
	Thread.sleep(3000);
	WebElement e1 = driver.findElement(By.xpath("//header[text()=' Different Examples of Alerts ']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", e1);
	Thread.sleep(4000);
	driver.findElement(By.id("javascriptConfirmBox")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(4000);
	alert.accept();
	String actualmsg = driver.findElement(By.xpath("//*[contains(@id,'pgraphdemo')]")).getText();
	
	String s1= "You pressed OK!";
	
	if (actualmsg.equals(s1)) {
		System.out.println("You pressed OK!");
		
	} else {
		System.out.println("You pressed Cancel!");
		
	}
	
}
}
