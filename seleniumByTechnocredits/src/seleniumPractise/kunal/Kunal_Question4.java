package seleniumPractise.kunal;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;
public class Kunal_Question4 {
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
	driver.findElement(By.id("javascriptPromp")).click();
	
	String name = "Kunal";
	Alert alert = driver.switchTo().alert();

	alert.sendKeys(name);

	Thread.sleep(3000);

	alert.accept();

	WebElement e2 = driver.findElement(By.id("pgraphdemo"));

	boolean flag1 = e2.getText().equals("Hello " + name + "! How are you today?");

	if (flag1) {
	System.out.println("text verified on pressing ok");
	} else {
	System.out.println("text not verified on pressing ok");
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit' and @id='javascriptPromp']")).click();

	Thread.sleep(3000);
	alert.dismiss();

	}
}
