package MavenMai.Maven111;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseIH {
    // WebDriver instance that will be used by the tests
    protected WebDriver driver;

    // Base URL of the application to be tested
    private static String baseUrl = "https://the-internet.herokuapp.com/login";

    // Method to set up the WebDriver and open the browser before any test
    @BeforeTest
    public void setup() {
        // Use WebDriverManager to set up the ChromeDriver
        WebDriverManager.chromedriver().setup();
        // Initialize the WebDriver with a new instance of ChromeDriver
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Open the base URL in the browser
        driver.get(baseUrl);
    }

    // Method to close the browser after all tests have been executed
    @AfterTest
    public void tearDown() {
        // Check if the driver is not null to avoid NullPointerException
        if (driver != null) {
            // Quit the browser and clean up WebDriver resources
            driver.quit();
        }
    }
}