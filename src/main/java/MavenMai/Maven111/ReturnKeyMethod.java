package MavenMai.Maven111;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnKeyMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement textAreaField = driver.findElement(By.xpath("//*[@id=\"ta1\"]"));
		textAreaField.sendKeys("Automation Testing ");
		textAreaField.sendKeys(Keys.ENTER);

	}

}
