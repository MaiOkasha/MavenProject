/*
 * package MavenMai.Maven111;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver;
 * 
 * public class SelectListPage {
 * 
 * private WebDriver driver;
 * 
 * private By listLocator = By.xpath("//*[@id=\"listContainer\"]/nav"); private
 * By selectedItem = By.xpath("//*[@id=\"verticalListContainer\"]/li[2]");
 * 
 * public SelectListPage(WebDriver driver) { this.driver = driver; }
 * 
 * public void selectFirstItem() { driver.findElement(selectedItem).click(); }
 * 
 * public boolean isFirstItemActive() { return
 * driver.findElement(selectedItem).getAttribute("class").contains("ui-selected"
 * ); } }
 */