package Exam;

import java.util.List;

import org.apache.hc.client5.http.impl.Operations.CompletedFuture;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToDoListTest extends TestBase {

	@Test(dataProvider = "To DO List")
	public void testToDoList(String itemToDo) throws InterruptedException {

		WebElement inputField = driver
				.findElement(By.xpath("/html/body/app-root/section/app-todo-header/header/input"));
		inputField.sendKeys(itemToDo);
		inputField.sendKeys(Keys.RETURN);

		WebElement todoList = driver.findElement(By.xpath("/html/body/app-root"));
		String text = todoList.getText();
		// System.out.print(text);
		Assert.assertTrue(text.contains(itemToDo));

		List<WebElement> list = driver.findElements(By.cssSelector("ul.todo-list"));
		System.out.println(list.size());

		
		
		WebElement itemsCount = driver.findElement(By.xpath("/html/body/app-root/section/app-todo-footer/footer/span"));
		System.out.println(itemsCount.getText());
		
		//sert.assertTrue(itemsCount.getText().contains("2"));
		
		

		/*
		 * List<WebElement> list = driver.findElements(By.xpath(
		 * "/html/body/app-root/section/app-todo-list/main/ul")); for(WebElement element
		 * : list) { System.out.println(element.getText()); }
		 */

		// Assert.assertEquals(list.size(),2);

		// Make one completed
		/*
		 * WebElement checkbox = driver.findElement(By.cssSelector("input.toggle"));
		 * checkbox.click();
		 * 
		 * //Filter Copmleted WebElement copmleted = driver.findElement(By.xpath(
		 * "/html/body/app-root/section/app-todo-footer/footer/ul/li[3]/a"));
		 * copmleted.click();
		 * 
		 * //Assert Only completed System.out.println(copmleted.isDisplayed());
		 * Assert.assertTrue(copmleted.isDisplayed());
		 * 
		 * WebElement activeItems = driver.findElement(By.xpath(
		 * "/html/body/app-root/section/app-todo-footer/footer/ul/li[2]/a"));
		 * Assert.assertFalse(activeItems.isDisplayed());
		 * 
		 * WebElement allItems = driver.findElement(By.xpath(
		 * "/html/body/app-root/section/app-todo-footer/footer/ul/li[1]/a"));
		 * Assert.assertFalse(allItems.isDisplayed());
		 * 
		 * System.out.println(activeItems.isDisplayed());
		 * System.out.println(allItems.isDisplayed());
		 * 
		 * inputField.clear();
		 */

	}

	/*
	 * @AfterTest public void deleteItems() { WebElement deleteBtn =
	 * driver.findElement(By.cssSelector("button.destroy")); deleteBtn.click(); }
	 */

	@DataProvider(name = "To DO List")
	public Object[][] getData() {
		return new Object[][] { { "Item 1" }, { "Item 2" } };
	}

}
