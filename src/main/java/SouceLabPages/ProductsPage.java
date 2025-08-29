package SouceLabPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
	private WebDriver driver ; 
	
	By productLocator = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	By BtnLocator = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By badgeLocator = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SelectTheProduct() {
		driver.findElement(productLocator).click();
	}
	
	public void clickAddToCart() {
		driver.findElement(BtnLocator).click();
	}
	
	public void getCartSize() {
		driver.findElement(badgeLocator).getSize();
	}
	
}


