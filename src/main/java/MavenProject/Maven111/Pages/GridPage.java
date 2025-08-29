package MavenProject.Maven111.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GridPage {
	private WebDriver driver;

	private By gridTabLocator = By.xpath("//*[@id=\"demo-tab-grid\"]");
	private By gridItemLocator = By.xpath("//*[@id=\"row1\"]/li[3]");

	public GridPage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToGrid() {
		driver.findElement(gridTabLocator).click();
	}

	public void selectGridItem() {
		driver.findElement(gridItemLocator).click();
	}

	public boolean isGridItemActive() {
		return driver.findElement(gridItemLocator).getAttribute("class").contains("active");
	}
}
