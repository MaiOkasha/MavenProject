package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDisplayed {
	
	protected WebDriver driver;

	private static String baseURL = "https://the-internet.herokuapp.com/login";

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testIsDisplayed() {
		
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		System.out.println(username.isDisplayed());
		
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		WebElement firstCheckbox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		firstCheckbox.click();
		Assert.assertTrue(firstCheckbox.isSelected());
		System.out.println(firstCheckbox.isSelected());
		
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]"));
		
		option2.click();
		
		System.out.println(option2.isSelected());
	}
	

}
