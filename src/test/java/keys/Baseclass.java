package keys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Baseclass {
	static WebDriver driver;
	
	
		

	
		public Baseclass() {
//		System.setProperty("webdriver.chrome", "C:/Users/anant.t/eclipse-workspace/selenium/lib/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("flipkart"+ Keys.ENTER);
	
		
		driver.findElement(By.xpath("//div[@ class='yuRUbf']//h3")).click();
		driver.findElement(By.xpath("//div[@ class='IiD88i _351hSN']//input")).sendKeys("8630049086");
		driver.findElement(By.xpath("//div[@ class='IiD88i _351hSN']//input[@ type='password']")).sendKeys("086224"+Keys.ENTER);
//		driver.findElement(By.xpath("//div[@ class='_1D1L_j']//button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("ACCOUNT LOGIN SUCCESSFUL");
	
}
}