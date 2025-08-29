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

public class ByName {

	private WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coursera.org/?authMode=login");

	}

	@Test
	public void test() {

		WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
		emailField.sendKeys("maiokasha930");
		
		WebElement passField = driver.findElement(By.cssSelector("input[name='password']"));
		passField.sendKeys("1234");
		
		//It doesn't work 
		
		//WebElement isVisibleIcon = driver.findElement(By.cssSelector("svg[id='cds-react-aria5854146396-:r2f:']"));
		//WebElement isVisibleIcon = driver.findElement(By.xpath("//*[@id=\"cds-react-aria5854146396-:r2f:\"]"));
		//WebElement isVisibleIcon = driver.findElement(By.cssSelector(""));
		/*
		 * WebElement showPassBtn = driver.findElement(By.
		 * xpath("//button[@aria-label='Show password' or @aria-label='Hide password']\""
		 * )); showPassBtn.click();
		 */
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// استني overlay يختفي
		wait.until(ExpectedConditions.invisibilityOfElementLocated(
		    By.className("ReactModal__Overlay")
		));

		// هات زر show/hide password
		WebElement togglePassBtn = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//button[@aria-label='Show password' or @aria-label='Hide password']"))
		);

		// اضغطي عليه
		togglePassBtn.click();

		// تأكيد: اطبعي ال aria-label بعد الكليك
		System.out.println("After click: " + togglePassBtn.getAttribute("aria-label"));

		

		

		WebElement forgetPassword = driver.findElement(By.xpath("//button[@class='css-1xb40kg']"));
		forgetPassword.click();
	}

}
