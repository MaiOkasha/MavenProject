package practicing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownButton {

	private WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");

	}

	@Test
	public void testDropdownBtn() {

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));

		Select objSelect = new Select(dropdown);

		// objSelect.selectByIndex(2);

		objSelect.selectByValue("1");

		List<WebElement> list = objSelect.getOptions();
		for (WebElement option : list) {
			System.out.println(option.getText());
		}

	}
}
