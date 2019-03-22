package seleniumPractise.manisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Assignment3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =Init.initChromeDriver();
		driver.get("http://automationbykrishna.com");
        driver.findElement(By.linkText("Basic Elements")).click();
         System.out.println("on basic elements page");	
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@id='javascriptConfirmBox']")).click();
         Thread.sleep(2000);
        driver.switchTo().alert().accept();
       System.out.println("Message is "+driver.findElement(By.xpath("//div//p[text()='You pressed OK!']")).getText());
       // driver.switchTo().alert().dismiss();
       //System.out.println("Message is " +driver.findElement(By.xpath("//header//following-sibling::p[text()='You pressed Cancel!']")).getText());
        Thread.sleep(2000);
        driver.close();
         
         
	}

}
