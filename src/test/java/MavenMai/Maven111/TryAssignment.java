/*
 * package MavenMai.Maven111;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.annotations.Test;
 * 
 * public class TryAssignment {
 * 
 * @Test public void test() { WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * driver.get("https://demoqa.com/selectable"); List<WebElement> webElementList
 * = driver.findElements(By.xpath("//*[@id=\"listContainer\"]/nav"));
 * 
 * 
 * 
 * 
 * 
 * List<String> navBarItems = new ArrayList(); for(WebElement item :
 * webElementList) { navBarItems.add(item.getText());
 * 
 * } //List , Grid System.out.println(navBarItems);
 * 
 * //webElementList driver.switchTo().activeElement();
 * 
 * List<WebElement> listMenu =
 * driver.findElements(By.xpath("//*[@id=\"verticalListContainer\"]"));
 * 
 * List<String> list = new ArrayList(); for(WebElement menuItem :
 * webElementList) { list.add(menuItem.getText()); }
 * 
 * System.out.println(list);
 * 
 * 
 * WebElement list = driver.findElement(By.xpath("//*[@id=\"demo-tab-list\"]"));
 * list.click();
 * 
 * WebElement seconedItem =
 * driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]"));
 * seconedItem.clear();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 */