package MavenMai.Maven111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CourseraWebElementByID {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver webDriver = new EdgeDriver();
		webDriver.get("https://www.coursera.org/?authMode=login");
		WebElement email = webDriver.findElement(By.id("cds-react-aria6007813049-:r1t:"));
		webDriver.close();
	}
}
