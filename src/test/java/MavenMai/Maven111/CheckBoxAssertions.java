package MavenMai.Maven111;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxAssertions {
	
	 private WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    }
	    
	    @Test
	    public void testCheckboxCheckAndUncheck() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[2]")));

	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }

	        Assert.assertTrue(checkbox.isSelected());
	        
	        if (checkbox.isSelected()) {
	            checkbox.click();
	        }
	        Assert.assertFalse(checkbox.isSelected());
	    }
	    
	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }  
	}


