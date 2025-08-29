package MavenMai.Maven111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingisEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
		button.click();
		Thread.sleep(5000);
		Boolean isEnabled = button.isEnabled();
		System.out.println("Is the Disabled button Enabled After Clicking on it : " + isEnabled);
		button.click();
		Thread.sleep(5000);
		System.out.println("Is the Enabled  button Enabled After clicking on it : " + isEnabled);
	}

}
