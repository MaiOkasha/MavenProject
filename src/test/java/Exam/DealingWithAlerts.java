package Exam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DealingWithAlerts extends TestBase {

	@Test
	public void testAlerts() throws InterruptedException {

		WebElement seconedBtn = driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]"));
		seconedBtn.click();

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);

		Assert.assertTrue(text.contains("This alert appeared after 5 seconds" ) , "The Alert didn't appear");
	}

}
