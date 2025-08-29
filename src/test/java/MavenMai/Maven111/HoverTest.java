package MavenMai.Maven111;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest {
    public WebDriver driver; // Declare the WebDriver instance

    @Test
    public void testHover() {
        driver = new ChromeDriver(); // Initialize the ChromeDriver
        driver.manage().window().maximize(); // Maximize the browser window
        driver.get("https://the-internet.herokuapp.com/hovers"); // Navigate to the target URL

        // Locate the first image element on the page using XPath
        WebElement image = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));

        // Create an instance of Actions to perform complex user interactions
        Actions actions = new Actions(driver);

        actions.moveToElement(image).perform(); // Move the mouse to hover over the image
        
        // Locate the user information element that appears after hovering over the image
        WebElement user = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/h5"));
        String text = user.getText(); // Get the text content of the user information element

        // Print the user information text to the console
        System.out.println("user information: " + text);
    }
}