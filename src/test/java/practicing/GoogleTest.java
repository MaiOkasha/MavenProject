package practicing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	
	protected WebDriver driver;

	private static String baseURL = "https://www.google.com/";

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
	public void test() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue(title.contains("Google"));
	}

}
