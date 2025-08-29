package SouceLabPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	By usernameLocator = By.xpath("//*[@id=\"user-name\"]");
	By passwordLocator = By.xpath("//*[@id=\"password\"]");
	By LoginBtnLocator = By.xpath("//*[@id=\"login-button\"]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public void enterUsername(String username ) {
		driver.findElement(usernameLocator).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void submitLogin() {
		driver.findElement(LoginBtnLocator).click();
	}
	
	public void login(String username , String password) {
		enterUsername(username);
		enterPassword(password);
		submitLogin();
	}
	
	
	
}
