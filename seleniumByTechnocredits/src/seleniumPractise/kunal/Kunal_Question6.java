package seleniumPractise.kunal;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Init;
public class Kunal_Question6 {
	  static WebDriver driver= Init.initChromeDriver();
public static void main(String[] args) throws InterruptedException {
	driver.get("http://automationbykrishna.com/#");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Registration")).click();
	System.out.println("on Registration page");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("kunal karanjkar");
	System.out.println("Fullname");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Pune");
	System.out.println("Address");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//input[@name='useremail']")).sendKeys("kunal@gmial.com");
	System.out.println("Email id");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.id("usercity")).sendKeys("Pune");
	System.out.println("City");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//input[@name='organization']")).sendKeys("Hub");
	System.out.println("Company");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//label//input[@id='radio-01']")).click();
	System.out.println("Gender");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//input[@id='usernameReg']")).sendKeys("kunalk13");
	System.out.println("Username");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//input[@id='passwordReg']")).sendKeys("kkkkkk");
	System.out.println("Password");
	Thread.sleep(2000);
	scrolling();
	driver.findElement(By.xpath("//input[@id='repasswordReg']")).sendKeys("kkkkkk");
	System.out.println("Re enter password");
	Thread.sleep(2000);
	scrolling();
    driver.findElement(By.id("signupAgreement")).click();
	System.out.println("Terms and conditions");
    Thread.sleep(1000);
    scrolling();
    driver.findElement(By.xpath("//button[@id='btnsubmitsignUp']")).click();
	System.out.println("sign up");
    Thread.sleep(2000);
    
    driver.switchTo().alert().accept();
   
	}


public static void scrolling() throws InterruptedException {
	WebElement e1= driver.findElement(By.xpath("//button[@id='btnsubmitsignUp']"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", e1);
	e1.click();
	Thread.sleep(1000);
	Alert alert=driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(4000);	
}
			
}