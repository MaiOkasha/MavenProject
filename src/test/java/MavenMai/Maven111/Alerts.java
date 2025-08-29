package MavenMai.Maven111;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod; // New import
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void testAlerts() throws InterruptedException {
    	
        //  Find the web element for the alert
        WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        button.click();
        
        //  Shift to the alert
        Alert alert = driver.switchTo().alert();
        
        // Get alert text( Should Be null) 
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);
        
        // Dismiss Alert 
        alert.dismiss();
        
        
        // Assert the result After Dismiss
        WebElement resultElement = driver.findElement(By.id("result"));
        String resultAfterDismiss = resultElement.getText();
        Assert.assertEquals(resultAfterDismiss, "You entered: null");

        Thread.sleep(2000);
        
        //New Alert 
        button.click();
        driver.switchTo().alert();
        
        //Enter input 
        alert.sendKeys("Dealing with Alerts");
        
        //7- Accept Alert 
        alert.accept();
        
        //Assert the Result After Accepting
        String resultAfterAccept = resultElement.getText();
        Assert.assertTrue(resultAfterAccept.contains("Dealing with Alerts"));
       
    }
}