package seleniumPractise.swatiN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;
//Validating alert msg with hardcoded string
public class AlertValidationOK_Asn2 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=Init.initChromeDriver();
	driver.get("http://automationbykrishna.com/#");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Basic Elements']")).click();
	Thread.sleep(1000);
	WebElement element= driver.findElement(By.xpath("//button[@class='btn btn-success']"));

	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	System.out.println("scrolled successfully");
	
	element.click();
	String text="You must be TechnoCredits student!!";
	Alert alert = driver.switchTo().alert();
    String alertText=alert.getText();
    
    if(text.equals(alertText))
    {
    	System.out.println("String Matched");
    }
}
}