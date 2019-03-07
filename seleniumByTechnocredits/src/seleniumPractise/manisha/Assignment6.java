package seleniumPractise.manisha;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

import util.Init;

	public class Assignment6 {
		static WebDriver driver = Init.initChromeDriver();
		public static void main(String[] args) throws InterruptedException {
			
			driver.get("http://automationbykrishna.com");
	        driver.findElement(By.linkText("Registration")).click();
	         System.out.println("on Registration page");	
	         driver.manage().window().maximize();
	        Thread.sleep(2000);
			scrolling();
			driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Manisha Sharma");
			Thread.sleep(2000);
			scrolling();
			driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Balewadi");
			Thread.sleep(2000);
			scrolling();
			driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys("m.sharma887@gmail.com");
			Thread.sleep(2000);
			scrolling();
			driver.findElement(By.xpath("//input[@id='usercity']")).sendKeys("Pune");
			Thread.sleep(2000);
			scrolling();
			driver.findElement(By.xpath("//input[@id='organization']")).sendKeys("Capgemini");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label//input[@id='radio-02']")).click();
			Thread.sleep(2000);
			scrolling();
			driver.findElement(By.xpath("//input[@id='usernameReg']")).sendKeys("Manisha48");
			Thread.sleep(2000);
			scrolling();
			driver.findElement(By.xpath("//input[@id='passwordReg']")).sendKeys("abcd1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='repasswordReg']")).sendKeys("abcd1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='btnsubmitsignUp']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		    driver.findElement(By.xpath("//input[@value='agree this condition']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[@id='btnsubmitsignUp']")).click();
		    Thread.sleep(2000);
		    System.out.println("Finally "+driver.switchTo().alert().getText());
		    driver.switchTo().alert().accept();
		    driver.close();
		}
		
		public static void scrolling() throws InterruptedException{
			WebElement element= driver.findElement(By.xpath("//button[@id='btnsubmitsignUp']"));
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			System.out.println("scrolled");
			element.click();
			Alert alert=driver.switchTo().alert();
			alert.accept();
			Thread.sleep(1000);
			
		}

	}

