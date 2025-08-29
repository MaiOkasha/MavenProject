package MavenMai.Maven111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMothod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement disabledButton = driver.findElement(By.xpath("//*[@id=\"but1\"]"));
		String text = disabledButton.getText();
		System.out.println("Text is : " + text);
		driver.close();

	}

}
