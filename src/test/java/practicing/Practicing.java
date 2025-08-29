package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practicing {

	private WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.coursera.org/courseraplus/?adgroupid=156245795749&adposition=&authMode=login&campaignid=20858197888&creativeid=692160334961&device=c&devicemodel=&gad_source=1&gclid=CjwKCAjwouexBhAuEiwAtW_ZxwZzXySIKWC3G3MtEUfBaYQhx8Q2GiSvfZWbiDxbQpy4CvrB5e8Y5BoCdGoQAvD_BwE&hide_mobile_promo&keyword=coursera&matchtype=e&network=g&term=%7Bterm%7D&utm_campaign=B2C_EMEA__coursera_FTCOF_courseraplus&utm_medium=sem&utm_source=gg");
	}

	@Test
	public void testVisibleIcon() {

		WebElement showPassBtn = driver.findElement(
				By.xpath("/html/body/div[8]/div/div/section/section/div[1]/form/div[3]/div[2]/div[1]/div/div/button"));
		showPassBtn.click();

	}

}
