package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Second_TestNG {
	WebDriver driver = new ChromeDriver();

	@Test
	public void f() throws InterruptedException {

		// TODO Auto-generated method stub

		// From City
		driver.findElement(By.id("fromCity")).sendKeys("Mumbai, India");
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

		// To City
		driver.findElement(By.id("toCity")).sendKeys("Kochi, India");
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

		// Search the flight
		driver.findElement(By.className("widgetSearchBtn")).click();
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
