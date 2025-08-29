package Exam;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFlightSearch extends TestBase {

	@Test(priority = 1)
	public void testSearch() {

		/*
		 * driver.switchTo().frame(0);
		 * 
		 * WebElement cookies =
		 * driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div[4]/a[1]"));
		 * cookies.click();
		 */
		WebElement departureCity = driver.findElement(By.xpath("//*[@id=\"jb-autocomplete-1-search\"]"));
		departureCity.clear();
		departureCity.sendKeys("Mumbai");

		WebElement choice = driver.findElement(By.xpath("//*[@id=\"jb-autocomplete-1-option-item-0\"]"));
		choice.click();

		WebElement toCity = driver.findElement(By.xpath("//input[@id=\"jb-autocomplete-2-search\"]"));
		toCity.sendKeys("London-Heathrow, UK (LHR)");

		WebElement choice2 = driver.findElement(By.xpath("//*[@id=\"jb-autocomplete-2-option-item-2\"]"));
		choice2.click();

		LocalDate currentDate1 = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate1.format(formatter);

		WebElement departDate = driver.findElement(By.xpath(" //*[@id=\"jb-date-picker-input-id-2\"]"));

		departDate.click();
		driver.switchTo().defaultContent();
		WebElement doneBtn = driver.findElement(By.xpath(
				"//*[@id=\"jb-tabpanel-id-0\"]/div/jb-renderer-template/dot-booker-air/div/dot-booker-air-form/form/div[1]/div[2]/div[1]/dot-date-range-picker/jb-date-picker/jb-flyout-inner/div/jb-range-calendar/div[2]/div/div[3]/div[13]/jb-utility-bar/div/jb-utility-bar-actions/div/button"));
		doneBtn.click();

		LocalDate date2 = LocalDate.now().plusDays(2);
		DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate2 = date2.format(formatterr);

		WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"jb-date-picker-input-id-3\"]"));

		returnDate.click();

		WebElement doneBtn2 = driver.findElement(By.xpath(
				"//*[@id=\"jb-tabpanel-id-0\"]/div/jb-renderer-template/dot-booker-air/div/dot-booker-air-form/form/div[1]/div[2]/div[1]/dot-date-range-picker/jb-date-picker/jb-flyout-inner/div/jb-range-calendar/div[2]/div/div[3]/div[13]/jb-utility-bar/div/jb-utility-bar-actions/div/button"));
		doneBtn2.click();

		WebElement searchBtn = driver.findElement(By.xpath(
				"//*[@id=\"jb-tabpanel-id-0\"]/div/jb-renderer-template/dot-booker-air/div/dot-booker-air-form/form/div[1]/div[2]/div[3]/div/button"));
		searchBtn.click();

		WebElement iamNotARobot = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));

		iamNotARobot.click();

		WebElement message = driver
				.findElement(By.xpath("//*[@id=\"cb-flights\"]/div/cb-flight-not-found-card/div/div/div/div/h2"));
		Assert.assertTrue(message.isDisplayed());

	}

	@Test(priority = 2)
	public void testSearch2() {

		WebElement departureCity = driver.findElement(By.xpath("//*[@id=\"jb-autocomplete-1-search\"]"));
		departureCity.clear();
		departureCity.sendKeys("Mumbai");

		WebElement choice = driver.findElement(By.xpath("//*[@id=\"jb-autocomplete-1-option-item-0\"]"));
		choice.click();

		WebElement toCity = driver.findElement(By.xpath("//input[@id=\"jb-autocomplete-2-search\"]"));
		toCity.sendKeys("London-Heathrow, UK (LHR)");

		WebElement choice2 = driver.findElement(By.xpath("//*[@id=\"jb-autocomplete-2-option-item-2\"]"));
		choice2.click();

		LocalDate currentDate1 = LocalDate.of(1, 1, 2024);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = currentDate1.format(formatter);

		WebElement departDate = driver.findElement(By.xpath(" //*[@id=\"jb-date-picker-input-id-2\"]"));

		departDate.click();
		driver.switchTo().defaultContent();
		WebElement doneBtn = driver.findElement(By.xpath(
				"//*[@id=\"jb-tabpanel-id-0\"]/div/jb-renderer-template/dot-booker-air/div/dot-booker-air-form/form/div[1]/div[2]/div[1]/dot-date-range-picker/jb-date-picker/jb-flyout-inner/div/jb-range-calendar/div[2]/div/div[3]/div[13]/jb-utility-bar/div/jb-utility-bar-actions/div/button"));
		doneBtn.click();

		LocalDate date2 = LocalDate.of(1, 1, 2024);
		DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate2 = date2.format(formatterr);

		WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"jb-date-picker-input-id-3\"]"));

		returnDate.click();

		WebElement doneBtn2 = driver.findElement(By.xpath(
				"//*[@id=\"jb-tabpanel-id-0\"]/div/jb-renderer-template/dot-booker-air/div/dot-booker-air-form/form/div[1]/div[2]/div[1]/dot-date-range-picker/jb-date-picker/jb-flyout-inner/div/jb-range-calendar/div[2]/div/div[3]/div[13]/jb-utility-bar/div/jb-utility-bar-actions/div/button"));
		doneBtn2.click();

		WebElement searchBtn = driver.findElement(By.xpath(
				"//*[@id=\"jb-tabpanel-id-0\"]/div/jb-renderer-template/dot-booker-air/div/dot-booker-air-form/form/div[1]/div[2]/div[3]/div/button"));
		searchBtn.click();

		WebElement iamNotARobot = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));

		iamNotARobot.click();

		WebElement message = driver
				.findElement(By.xpath("//*[@id=\"cb-flights\"]/div/cb-flight-not-found-card/div/div/div/div/h2"));
		Assert.assertTrue(message.isDisplayed());

	}

}
