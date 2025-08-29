//package MavenMai.Maven111;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class SelectGridPage {
//    private WebDriver driver;
//
//    private By thirdItemLocator = By.xpath("//td[text()='Three']");
//
//    public SelectGridPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void clickThirdItem() {
//        driver.findElement(thirdItemLocator).click();
//    }
//
//    public boolean isThirdItemActive() {
//        return driver.findElement(thirdItemLocator).getAttribute("class").contains("ui-selected");
//    }
//}