package practicing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameAndList extends TestBase{
	
	@Test
	public void test() {
		
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> menuItems = driver.findElements(By.xpath("//*[@id=\"menu\"]"));
		for(WebElement option : menuItems) {
			System.out.println(option.getText());
		}
		
		WebElement item = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]"));
		item.click();
		System.out.println(item.getText());
		
		
	}

}
