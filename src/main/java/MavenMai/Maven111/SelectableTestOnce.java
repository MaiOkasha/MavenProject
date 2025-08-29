package MavenMai.Maven111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class SelectableTestOnce {

    public static void main(String[] args) {
       
        WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Part 1 - Select from List
            System.out.println("Starting Part 1: Select from List...");
            driver.get("https://demoqa.com/selectable");

            // Ensure the "List" tab is active (it is by default)
            WebElement listTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-tab-list")));
           
            System.out.println("List tab is active.");
            //Assert True 
            Boolean isActive = listTab.isEnabled();
            System.out.println(isActive);

            WebElement listItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Dapibus ac facilisis in']")));
            listItem.click();
            System.out.println("Clicked on 'Dapibus ac facilisis in'.");

            // Assert that this item becomes active
            String activeClass = listItem.getAttribute("class");
            if (activeClass.contains("list-group-item active")) {
                System.out.println("Assertion Passed: The item 'Dapibus ac facilisis in' is active.");
            } else {
                System.out.println("Assertion Failed: The item 'Dapibus ac facilisis in' is not active. Current class: " + activeClass);
            }
            
            // --- Separate the parts for clarity ---
            System.out.println("\n------------------------------------\n");
            
            // Part 2 - Select from Grid
            System.out.println("Starting Part 2: Select from Grid...");
            
            // Click the "Grid" tab
            WebElement gridTab = wait.until(ExpectedConditions.elementToBeClickable(By.id("demo-tab-grid")));
            gridTab.click();
            System.out.println("Clicked on 'Grid' tab.");

            // Select the item: "Three"
            WebElement gridItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Three']")));
            gridItem.click();
            System.out.println("Clicked on 'Three'.");

            // Assert that this item becomes active
            String gridItemClass = gridItem.getAttribute("class");
            if (gridItemClass.contains("list-group-item active")) {
                System.out.println("Assertion Passed: The item 'Three' is active.");
            } else {
                System.out.println("Assertion Failed: The item 'Three' is not active. Current class: " + gridItemClass);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}