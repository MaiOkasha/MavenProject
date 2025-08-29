package MavenMai.Maven111;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBaseIH {

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedMessage) {
        // Locate the WebElements for username, password, and login button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        // Clear any existing text and enter the username and password
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);

        // Click the login button
        loginButton.click();

        // Locate the flash message element and get its text
        WebElement flashMessage = driver.findElement(By.id("flash"));
        String actualMessage = flashMessage.getText().trim();

        // Check if the actual message contains the expected message
        Assert.assertTrue(actualMessage.contains(expectedMessage),
            "Expected message: \"" + expectedMessage + "\", but got: \"" + actualMessage + "\"");
    }

    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
            {"invalidusername", "invalidpassword", "Your username is invalid!"},
            {"tomsmith", "SuperSecretPassword!", "You logged into a secure area!"}
        };
    }
}