package seleniumPractise.manisha;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Assignment4 {
	
	public static void main(String[] args) throws InterruptedException {
		String s2="Asmita";
		WebDriver driver=Init.initChromeDriver();
		driver.get("http://automationbykrishna.com");
		System.out.println("opened page");
		driver.findElement(By.linkText("Basic Elements")).click();
		System.out.println("On basic elements page");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='javascriptPromp']")).click();
		System.out.println("clicked on javascript prompt button");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(s2);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		String s1= driver.findElement(By.xpath("//header[text()=' Different Examples of Alerts ']//following-sibling:: p")).getText();
		//System.out.println(s1);
		if (s1.equals("Hello"+" "+s2+"! How are you today?"))
		{
			System.out.println("Whoa! Correct message is printed");
		}
		else{
			System.out.println("Oops Wrong messageis printed");
		}
		System.out.println("done");
		
		Thread.sleep(3000);
		driver.close();
	}

}
