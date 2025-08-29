package practicing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestWithDataProvider extends TestBase {

	@Test(dataProvider = "Login Data")
	public void testLogin(String username, String password, String expectedMessage) {

		WebElement usernameInput = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		usernameInput.sendKeys(username);

		WebElement passInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passInput.sendKeys(password);

		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		loginBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement flashMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));

		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"flash\"]"));

		String actualMessage = errorMessage.getText().trim();

		Assert.assertTrue(actualMessage.contains(expectedMessage));

	}

	@DataProvider(name = "Login Data")
	public Object[][] getData() {
		return new Object[][] {
			{ "wrongUser", "SuperSecretPassword!", "Your username is invalid!" },
			 { "tomsmith", "SuperSecretPassword!", "You logged into a secure area!" },
			
		};
		}
			   
				
				
	}

