package Exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	protected WebDriver driver;

	private static String baseURL = "https://www.jetblue.com/";

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

}
