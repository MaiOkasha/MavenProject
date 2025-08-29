package MavenProject.Maven111.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListPage {

	private WebDriver driver;

	private By listTabLocator = By.xpath("//*[@id=\"demo-tab-list\"]");
	private By listItemLocater = By.xpath("//*[@id=\"verticalListContainer\"]/li[2]");

	public ListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToList() {
		driver.findElement(listTabLocator).click();
	}

	public void selectListItem() {
		driver.findElement(listItemLocater).click();
	}

	public boolean isListItemActive() {
		return driver.findElement(listItemLocater).getAttribute("class").contains("active");
	}

}
