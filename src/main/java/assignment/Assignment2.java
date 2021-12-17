package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://retailm1.upskills.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);		
		a.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user-o']")))
		.moveToElement(driver.findElement(By.xpath("//span[contains(.,'LOGIN / REGISTER')]"))).click().build().perform();
		
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vijaycv7@in.ibm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vijaycv1");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		System.out.println("Page title is : " + driver.getTitle());
		

	}

}
