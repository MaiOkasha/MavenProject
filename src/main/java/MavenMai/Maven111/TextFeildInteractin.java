package MavenMai.Maven111;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFeildInteractin {

	public static void main(String[] args) {
		 // Setup Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the Chrome browser
        driver.manage().window().maximize();

        // Store the home page URL in a variable URL of type String
        String URL = "https://www.guru99.com/";

        // Call get() method using reference variable driver and pass URL as parameter to get method
        driver.get(URL);

        // Find Search icon
        WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]"));

        // Store the attribute value
        String value = searchIcon.getAttribute("class");

        // Print the value
        System.out.println("Value of Search attribute is: " + value);
        
        searchIcon.sendKeys("Hi Mai ");
        //Click Enter to submit 
        searchIcon.sendKeys(Keys.RETURN);
	}

}
