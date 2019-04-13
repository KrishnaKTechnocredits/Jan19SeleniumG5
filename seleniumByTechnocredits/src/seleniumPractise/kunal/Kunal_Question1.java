package seleniumPractise.kunal;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Kunal_Question1 {
public static void main(String[] args) throws InterruptedException
{
	
    WebDriver driver= Init.initChromeDriver();
	driver.get("http://automationbykrishna.com/#");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Basic Elements")).click();
	System.out.println("on basic elements page");
	Thread.sleep(3000);
	driver.findElement(By.id("UserFirstName")).sendKeys(("Kunal"));
	System.out.println("Firstname Entered");
	driver.findElement(By.xpath("//input[@name='ulname']")).sendKeys("Karanjkar");
	System.out.println("Lasttname Entered");
	driver.findElement(By.xpath("//input[@name='cmpname'][@type='text']")).sendKeys("hubmatrix");
	System.out.println("Companyname Entered");
	driver.findElement(By.xpath("//div[@name='secondSegment'][1]//button[@type='submit']")).click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String s= "Kunal and Karanjkar and hubmatrix";
	String s1 = alert.getText();
	if(s.equals(s1)) 
	{
		System.out.println("Text are same");
		alert.accept();	
	}
	else
	{
		System.out.println("Text is not same");
		alert.dismiss();	
	}
	
}
}
