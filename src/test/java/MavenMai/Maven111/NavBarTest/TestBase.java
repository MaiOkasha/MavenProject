package MavenMai.Maven111.NavBarTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	protected WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/selectable");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}