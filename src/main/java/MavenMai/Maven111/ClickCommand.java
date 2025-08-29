package MavenMai.Maven111;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickCommand {

	public static void main(String[] args) throws IOException {

		// setup chrome driver
		WebDriver driver = new ChromeDriver();
		// Maximize the Chrome browser.
		driver.manage().window().maximize();
		// Customize the size of Window
		driver.manage().window().setSize(new Dimension(1000, 700));
		// Store the home page URL in a variable URL of type String.
		String URL = "https://omayo.blogspot.com/";
		// Call get() method using reference variable driver and pass URL as parameter
		// to get method.
		driver.get(URL);
		// find Button 2
		WebElement button = driver.findElement(By.id("but2"));
		// simulates left click on Button 2
		button.click();
		// Simulate Right Click
		Actions action = new Actions(driver);
		action.contextClick(button);
		// Take a screenShot
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image.png"));

	}
}
