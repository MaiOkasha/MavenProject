/*
 * package MavenMai.Maven111;
 * 
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.edge.EdgeDriver; import org.testng.annotations.AfterTest;
 * import org.testng.annotations.BeforeTest; import
 * io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class TestBaseSelectable { protected WebDriver driver; private static
 * String baseUrl = "https://demoqa.com/selectable";
 * 
 * @BeforeTest public void setup() { WebDriverManager.edgedriver().setup();
 * driver = new EdgeDriver(); driver.manage().window().maximize();
 * driver.get(baseUrl); }
 * 
 * 
 * @AfterTest public void tearDown() { if (driver != null) { driver.quit(); } }
 * 
 * }
 */