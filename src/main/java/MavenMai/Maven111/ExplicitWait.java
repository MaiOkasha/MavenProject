package MavenMai.Maven111;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String args[]) {
        //setup chrome driver
        WebDriver driver = new ChromeDriver();
        // Maximize the Chrome browser.
        driver.manage().window().maximize();
        // Store the home page URL in a variable URL of type String.
        String URL = "https://www.guru99.com/";
        // Call get() method using reference variable driver and pass URL as parameter to get method.
        driver.get(URL);
        // Wait until guru logo is displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement guruLogo = driver.findElement(By.className("has-logo-image"));
        wait.until(ExpectedConditions.visibilityOf(guruLogo));
    }
}