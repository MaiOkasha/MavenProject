/*
 * package MavenMai.Maven111; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * 
 * public class SelectablePage { private WebDriver driver;
 * 
 * private By listTab = By.id("demo-tab-list"); private By gridTab =
 * By.id("demo-tab-grid"); private By dapibusItem =
 * By.xpath("//li[text()='Dapibus ac facilisis in']"); private By threeItem =
 * By.xpath("//li[text()='Three']");
 * 
 * public SelectablePage(WebDriver driver) { this.driver = driver; }
 * 
 * public void clickListTab() { driver.findElement(listTab).click(); }
 * 
 * public void clickGridTab() { driver.findElement(gridTab).click(); }
 * 
 * public void selectDapibusItem() { driver.findElement(dapibusItem).click(); }
 * 
 * public void selectThreeItem() { driver.findElement(threeItem).click(); }
 * 
 * public boolean isDapibusItemActive() { WebElement item =
 * driver.findElement(dapibusItem); return
 * item.getAttribute("class").contains("active"); }
 * 
 * public boolean isThreeItemActive() { WebElement item =
 * driver.findElement(threeItem); return
 * item.getAttribute("class").contains("active"); } }
 * 
 */