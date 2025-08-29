package MavenMai.Maven111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingXPathByClassName {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement loginButton = driver.findElement(By.xpath("//*[@class=\"submit-button btn_action\"]"));
		loginButton.click();
		driver.close();

	}

}

