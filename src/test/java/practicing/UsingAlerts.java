package practicing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UsingAlerts extends TestBase {

	@Test
	public void test() throws InterruptedException {

		WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		button.click();

		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.dismiss();
		
		
		Thread.sleep(2000);
		
		button.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		
		

	}

}
