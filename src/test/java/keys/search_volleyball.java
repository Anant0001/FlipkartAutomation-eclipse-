package keys;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class search_volleyball extends Baseclass{
	
//    static WebDriver driver =new ChromeDriver();	
//	add_cart cart=new add_cart();
	String s;
	
	public search_volleyball() {
		super();
	}
    
	 public  void search_item1() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 s=driver.getCurrentUrl();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("volleyball"+ Keys.ENTER);
	
//	 wait(10);
	 driver.findElement(By.xpath("//a[@ title='NIVIA Spikester (Encounter) Volleyball - Size: 4']")).click();
//	 driver.getWindowHandle();
	 ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
     //switch to new tab
     driver.switchTo().window(newTb.get(1));

     driver.findElement(By.xpath("//div[@ class='_3Oikkn _3_ezix _3Hbb-8']//button")).click();
     System.out.println("Your address filled and one step to go !!!!!!!!!");
	 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
	 
	
		
//	cart.add_item1_to_cart();
	 driver.findElement(By.xpath("//div[@ id='CNTCT937C7A9E4C894E9590C08EF47']//button")).click();
	 
	
	  
	  driver.findElement(By.xpath("//div[@ class='McovBK']//button")).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,100)");
	  
	  System.out.println("Payment not done for volleyball ");
				Thread.sleep(2);
	}

	public void Switch_to_Window() {
		driver.navigate().to(s); 
	}
	public void search_mobile() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
//		selecting a 6 gb specification
//		driver.findElement(By.xpath("//div[@ class='_24_Dny']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		selecting the mobile 
				driver.findElement(By.xpath("//div[@ class='_2kHMtA']//div//img")).click();
				
				 ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
//			     switch to new tab
			     driver.switchTo().window(tab.get(2));
				
			    
			 
			     
//			     driver.findElement(By.xpath("//div[@ class='_3Oikkn _3_ezix _3Hbb-8']//button")).click();
				 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
				 
				
					
//				cart.add_item1_to_cart();
				 driver.findElement(By.xpath("//div[@ id='CNTCT937C7A9E4C894E9590C08EF47']//button")).click();
				 System.out.println("Your address filled and one step to go !!!!!!!!!");
				
				  
				  driver.findElement(By.xpath("//div[@ class='McovBK']//button")).click();
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,100)");
				  
				  System.out.println("Payment not done for mobile phone ");
							Thread.sleep(2);
	}
	public void search_sportswear() {
		driver.findElement(By.name("q")).sendKeys("Sportswear"+Keys.ENTER);
//		selecting a 6 gb specification
//		driver.findElement(By.xpath("//div[@ class='_24_Dny']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		selecting the mobile 
				driver.findElement(By.xpath("//div[@ class='_3ywSr_']//div//img")).click();
				
				 ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
//			     switch to new tab
			     driver.switchTo().window(tab.get(3));
				
			    
			 
			     
//			     driver.findElement(By.xpath("//div[@ class='_3Oikkn _3_ezix _3Hbb-8']//button")).click();
				 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
				 
				
					
//				cart.add_item1_to_cart();
				 driver.findElement(By.xpath("//div[@ id='CNTCT937C7A9E4C894E9590C08EF47']//button")).click();
				 System.out.println("Your address filled and one step to go !!!!!!!!!");
				
				  
				  driver.findElement(By.xpath("//div[@ class='McovBK']//button")).click();
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,100)");
				  
				  System.out.println("Payment not done for sportwear ");
							try {
								Thread.sleep(2);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	}
}
