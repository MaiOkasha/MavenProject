/*
 * package MavenMai.Maven111;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.BeforeClass;
 * import org.testng.annotations.Test;
 * 
 * public class SelectTest { private WebDriver driver; private SelectListPage
 * selectListPage; private SelectGridPage selectGridPage;
 * 
 * @BeforeClass public void setUp() { driver = new ChromeDriver();
 * driver.get("http://demoqa.com/selectable");
 * 
 * selectListPage = new SelectListPage(driver); selectGridPage = new
 * SelectGridPage(driver); }
 * 
 * @Test(priority = 1) public void testSelectList() {
 * selectListPage.selectFirstItem();
 * Assert.assertTrue(selectListPage.isFirstItemActive(),
 * "First item is not active"); }
 * 
 * @Test(priority = 2) public void testSelectGrid() {
 * driver.get("http://demoqa.com/selectable"); selectGridPage.clickThirdItem();
 * Assert.assertTrue(selectGridPage.isThirdItemActive(),
 * "Third item is not active"); }
 * 
 * 
 * @AfterClass public void tearDown() { driver.quit(); }
 * 
 * }
 */