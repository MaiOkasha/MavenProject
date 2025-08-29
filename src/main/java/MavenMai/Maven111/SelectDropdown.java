package MavenMai.Maven111;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
    public static void main(String args[]) {
        //setup chrome driver
        WebDriver driver = new ChromeDriver();
        // Maximize the Chrome browser.
        driver.manage().window().maximize();
        // Store the home page URL in a variable URL of type String.
        String URL = "https://the-internet.herokuapp.com/dropdown";
        // Call get() method using reference variable driver and pass URL as parameter to get method.
        driver.get(URL);
        // find dropdown list by id
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        // Create select object
        Select objSelect = new Select(dropdown);
        // Select Option 1 by index 1
       // objSelect.selectByIndex(1);
        //objSelect.selectByVisibleText("Option 2");
       // List<WebElement> optionsList = objSelect.getOptions();
       // for(WebElement option : optionsList) {
        	//System.out.println(option.getText());
        	
       // }
        
		/*
		 * Select objectSelect = new Select(dropdown); List<WebElement> menu =
		 * objectSelect.getOptions(); for(WebElement option : menu) {
		 * System.out.println(option.getText());
		 * 
		 * }
		 */
        objSelect.selectByIndex(1);
        
       List<WebElement> menu = objSelect.getAllSelectedOptions();
       for(WebElement option : menu) {
    	   System.out.println(option.getText());
       }
    }
}
