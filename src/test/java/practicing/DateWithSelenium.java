package practicing;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateWithSelenium {
    public static void main(String[] args) {
        // افتح المتصفح
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");  // حطي رابط الموقع

        // جهزي التاريخ الحالي
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // صيغة تناسب input type="date"
        String today = sdf.format(date);

        // حطي التاريخ في الحقل
        WebElement dateField = driver.findElement(By.id("dateField"));
        dateField.sendKeys(today);
    }
}
