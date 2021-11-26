package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class payment {
WebDriver driver;
static search_volleyball search =new search_volleyball();

public void payment_item() throws InterruptedException {
	search.search_item1();
	search.Switch_to_Window();
	
	
}
public void payment_of_mobile() throws InterruptedException {
	search.search_mobile();
	search.Switch_to_Window();
}
public void payment_of_sportswear() {
	search.search_sportswear();
	search.Switch_to_Window();
}
public void add_item4_to_cart() {
	
}
}
