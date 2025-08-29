package SouceLabPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	private WebDriver driver;
	
	By cartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By removeBtn = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	

	
	
	
	
	

}
