package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SouceLab {

	private WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void test() {

		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");

		WebElement passInput = driver.findElement(By.xpath("//input[@name='password']"));
		passInput.sendKeys("secret_sauce");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		loginBtn.click();

		String value = loginBtn.getAttribute("class");
		System.out.println("Value is : " + value);

	}

}
