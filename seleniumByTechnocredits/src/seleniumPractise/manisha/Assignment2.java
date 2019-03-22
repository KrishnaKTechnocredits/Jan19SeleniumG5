package seleniumPractise.manisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Assignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Init.initChromeDriver();
		driver.get("http://automationbykrishna.com");
        driver.findElement(By.linkText("Basic Elements")).click();
         System.out.println("on basic elements page");	
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@id='javascriptAlert']")).click();
         Thread.sleep(2000);
       System.out.println("Message on alert pop up is "+driver.switchTo().alert().getText());
         driver.switchTo().alert().accept();
         Thread.sleep(3000);
         driver.close();
         
		
	}

}
