package Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;

import keys.payment;
import keys.search_volleyball;




@Test
public class test {
//	WebDriver driver;
//	search_item search= new search_item();
payment pay=new payment();
//	search_mobile m=new search_mobile();

	public void volley() throws InterruptedException {

		pay.payment_item();
		pay.payment_of_mobile();
		pay.payment_of_sportswear();
		
	System.out.println("AUTOMATION OF THE PRODUCT OF THE FLIPKART IS DONE !!!!!!!!!!!!!");
	System.out.println("CONGRATS YOU DID IT !!!!!!!!!!");
//		search.search_item1();
//		search.search_the_item2();

	}
	public void mobile() throws InterruptedException {
		
	}
	public void sports() {
	
	}
	
	
}
