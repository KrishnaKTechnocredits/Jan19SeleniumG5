package seleniumPractise.manisha;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver= Init.initChromeDriver();
        driver.get("http://automationbykrishna.com");
         driver.findElement(By.linkText("Basic Elements")).click();

          System.out.println("on basic elements page");
          Thread.sleep(1000);
          driver.findElement(By.xpath("//input[@id='UserFirstName']")).sendKeys("Manisha48");
          System.out.println("first name filled");
          Thread.sleep(1000);
          driver.findElement(By.xpath("//input[@id='UserLastName']")).sendKeys("Sharma");
          System.out.println("last name filled");
          Thread.sleep(1000);
          driver.findElement(By.xpath("//input[@id='UserCompanyName']")).sendKeys("Capgemini");
          System.out.println("company name filled");
          Thread.sleep(1000);
          driver.findElement(By.xpath("//header[text()=' Alert Demo ']//following-sibling::div//button[text()='Submit']")).click();
          System.out.println(" clicked on submit");
          Alert alert= driver.switchTo().alert();
  		  String s1=alert.getText();
  		  System.out.println("Message on alert pop up is "+ s1);
  		  alert.accept();
  		// Thread.sleep(2000);
  		// driver.close();


}
}
