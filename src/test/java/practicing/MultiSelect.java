package practicing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MultiSelect {
	
	protected WebDriver driver;

	private static String baseURL = "https://the-internet.herokuapp.com/dropdown?utm_source=chatgpt.com";

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
