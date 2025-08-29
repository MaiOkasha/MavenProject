package practicing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnableButton {

	private WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

	}

	@Test
	public void testEnabled() throws InterruptedException {

		WebElement button = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
		WebElement textField = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
		
		
		button.click();
		

		 Thread.sleep(5000);
		 
		 
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * wait.until(ExpectedConditions.elementToBeClickable(button));
		 */
		System.out.println(textField.isEnabled());
		button.click();

		Thread.sleep(5000);

		//wait.until(ExpectedConditions.elementToBeClickable(button));

		System.out.println(textField.isEnabled());

	}

}
