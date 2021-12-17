package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://retailm1.upskills.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		Actions a = new Actions(driver);		
		a.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-user-o']")))
		.moveToElement(driver.findElement(By.xpath("//span[contains(.,'LOGIN / REGISTER')]"))).click().build().perform();
		
				

		driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vijaykrisshna");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("cv");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vijaycv7@in.ibm.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9940196704");
		driver.findElement(By.xpath("//input[@name='address_1']")).sendKeys("selaiyur");
		driver.findElement(By.xpath("//input[@name='address_2']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("600073");
		
		
		WebElement c=driver.findElement(By.xpath("//select[@name='country_id']"));		
		Select country =new Select(c);		
		country.selectByVisibleText("India");
		
		WebElement s=driver.findElement(By.xpath("//select[@name='zone_id']"));		
		Select state =new Select(s);		
		state.selectByVisibleText("Karnataka");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vijaycv1");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("vijaycv1");
		
		
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String newpageurl = driver.getCurrentUrl();
		System.out.println("New page url is : "+ newpageurl);
		
		String message = driver.findElement(By.xpath("//p[contains(.,'Congratulations! Your new account has been successfully created!')]")).getText();
		System.out.println("Displayed message is : " + message);		
				
		
		String button = driver.findElement(By.xpath("//a[contains(.,'Continue')]")).getText();
		System.out.println(button + " button is present");
		

	}

}
