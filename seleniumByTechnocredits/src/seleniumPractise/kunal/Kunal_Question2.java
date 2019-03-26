package seleniumPractise.kunal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class Kunal_Question2 {
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver= Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Elements")).click();
		System.out.println("on basic elements page");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//header[text()=' Different Examples of Alerts ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit' and @id='javascriptAlert']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		if (alert.getText().equals("You must be TechnoCredits student!!")) {
			System.out.println("Text is same");
			alert.accept();
		} else {
			System.out.println("Text is not same");
			alert.dismiss();
		}
		driver.close();

	}
}
