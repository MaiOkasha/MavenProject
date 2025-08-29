package practicing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownList {

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

	@Test
	public void test() {

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));

		Select objSelect = new Select(dropdown);
		objSelect.selectByVisibleText("Option 1");

		String selectedOption = objSelect.getFirstSelectedOption().getText();

		Assert.assertEquals(selectedOption, "Option 1");
		Assert.assertFalse(selectedOption.isEmpty());

		List<WebElement> options = objSelect.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}

		Assert.assertTrue(options.size() >1);

	}

}
