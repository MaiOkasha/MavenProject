package practicing;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes extends TestBase {

	@Test
	public void test() {

		WebElement redCheckbox = driver
				.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));

		if (!redCheckbox.isSelected()) {
			redCheckbox.click();
		}

		Assert.assertTrue(redCheckbox.isSelected());

		if (redCheckbox.isSelected()) {
			redCheckbox.click();
		}

		assertFalse(redCheckbox.isSelected());

	}

}
