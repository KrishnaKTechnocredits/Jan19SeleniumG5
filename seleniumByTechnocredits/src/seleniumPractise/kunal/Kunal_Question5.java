package seleniumPractise.kunal;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;
public class Kunal_Question5 {
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver= Init.initChromeDriver();
	driver.get("http://automationbykrishna.com/#");
	driver.manage().window().maximize();
	driver.findElement(By.id("registration2")).click();
	System.out.println("on Registration page");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text'][@id='unameSignin']")).sendKeys("Kunal");
	//driver.findElement(By.id("unameSignin")).sendKeys("kunal");
	driver.findElement(By.xpath("//input[@type='password'][@id='pwdSignin']")).sendKeys("kunal1392");
	//driver.findElement(By.id("pwdSignin")).sendKeys("kunal13");
	driver.findElement(By.xpath("//button[@type='submit'][@id='btnsubmitdetails']")).click();
	
	//driver.findElement(By.id("btnsubmitdetails")).click();
	System.out.println("button clicked");
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	String s1="kunal1392";
	if(s1.length()<=8)
	{
		alert.accept();
		System.out.println("alert accept");
	}
	else
	{
		alert.dismiss();
		System.out.println("alert dismiss");
		driver.close();
	}
	
	
	}
}