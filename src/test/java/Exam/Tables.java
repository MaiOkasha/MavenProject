package Exam;

import java.awt.Frame;
import java.util.List;

import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tables extends TestBase {

	@Test(dataProvider = "Form Data" , priority = 1)
	public void testTables(String firstname, String lasttname, String email, int age, int salary, String department) {

		WebElement addBtn = driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]"));
		addBtn.click();

		/*
		 * WebElement frame = driver.findElement(By.xpath("/html/body/iframe"));
		 * 
		 * driver.switchTo().frame(frame);
		 */

		WebElement firstNameField = driver.findElement(By.cssSelector("input#firstName"));
		firstNameField.sendKeys(firstname);

		WebElement lastNameField = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastNameField.sendKeys(lasttname);

		WebElement emailField = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		emailField.sendKeys(email);

		WebElement ageFiled = driver.findElement(By.xpath("//*[@id=\"age\"]"));
		ageFiled.sendKeys(String.valueOf(age));

		WebElement salaryField = driver.findElement(By.xpath("//*[@id=\"salary\"]"));
		salaryField.sendKeys(String.valueOf(salary));

		WebElement departmentField = driver.findElement(By.xpath("//*[@id=\"department\"]"));
		departmentField.sendKeys(department);

		WebElement submitBtn = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		submitBtn.click();
		
		
		//Assert.assertTrue(firstNameField.isDisplayed());
		
		
		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"searchBox\"]"));
		searchBar.click();
		searchBar.sendKeys(firstname);
		
		
		WebElement tableOfResult = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]"));
		String row = tableOfResult.getText();
		
		Assert.assertTrue(row.contains(firstname));
		Assert.assertTrue(row.contains(lasttname));
		Assert.assertTrue(row.contains(email));
		Assert.assertTrue(row.contains(String.valueOf(age)));
		Assert.assertTrue(row.contains(String.valueOf(salary)));
		Assert.assertTrue(row.contains(department));
		
		
		
		/*
		 * List<WebElement> searchResult = driver.findElements(By.xpath(
		 * "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div")
		 * ); for(WebElement entry : searchResult) { System.out.println(entry.);
		 * 
		 * }
		 */
		
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]"));
				String text= table.getText();		
				Assert.assertTrue(text.contains(firstname));
				Assert.assertTrue(text.contains(lasttname));
				Assert.assertTrue(text.contains(email));
				Assert.assertTrue(text.contains(String.valueOf(age)));
				Assert.assertTrue(text.contains(String.valueOf(salary)));
				Assert.assertTrue(text.contains(department));
				
				
				
				
				
		
	/*	List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]"));
		for(WebElement entry : row) {
			System.out.println(entry.getText());
			//Assert.assertTrue(entry.getText().contains(firstname))	;
			
		}
		*/
		
		//System.out.println(row.get(0).getText());
		
		
		
		//Assert.assertTrue(row.get(0).getText().contains(firstname));
		
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("location.reload()");
		 */
		
		/*
		 * WebElement hiddenDiv = driver.findElement(By.xpath(
		 * "//*[@id=\\\"app\\\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]")
		 * ); String n = hiddenDiv.getText(); // does not work (returns "" as expected)
		 * String script = "return arguments[0].innerText"; n = (String)
		 * ((JavascriptExecutor) driver).executeScript(script, hiddenDiv);
		 */
	}
	
	
	@DataProvider(name = "Form Data")
	public Object[][] getData() {
		return new Object[][] { { "Mai", "Okasha", "maiokasha90@gmail.com", 23, 2000, "Software Engineering" },

		};
	}

}
