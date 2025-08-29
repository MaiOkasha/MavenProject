package TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

	private WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");

	}

	@DataProvider(name = "Login Data")
	public Object[][] loginProvider() {
		return new Object[][] { { "invalidUsername", "invalidUsername", "Your username is invalid" },
				{ "tomsmith", "SuperSecretPassword!", "You logged into a secure area!" }

		};
	}

	@Test(dataProvider = "Login Data")
	public void testLogin(String username, String password, String expectedMessage) {

		WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		usernameField.sendKeys(username);

		WebElement passField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passField.sendKeys(password);

		WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));
		loginBtn.click();

		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"flash\"]"));

		String actualMessage = errorMessage.getText().trim();
		
		Assert.assertTrue(actualMessage.contains(expectedMessage));


	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
