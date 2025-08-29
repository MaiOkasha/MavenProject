package practicing;

import java.sql.Driver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTextMethod {
	
	
	private WebDriver driver;

	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	}
	
	@Test
	public void test() {
		WebElement button1 = driver.findElement(By.xpath("//button[@id=\"but1\"]"));
		String value = button1.getText();
		System.out.println("Value is : " + value);
		
		WebElement textAreaFeild = driver.findElement(By.xpath("//*[@id=\"ta1\"]"));
		textAreaFeild.sendKeys("Mai Okasha");
		textAreaFeild.sendKeys(Keys.RETURN);
		
		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"but2\"]"));
		Actions action = new Actions(driver);
		
		action.contextClick(button2);
		
		WebElement checkbox  = driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
		WebElement blueCheckbox = driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		blueCheckbox.click();
		
		System.out.println(blueCheckbox.isSelected());
		
		
	}
}

