package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser {

	WebDriver driver;

	@Test
	public void f() {

		// Click on Search box and search for bags
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");

		// Click on the Search button after entering the text
		driver.findElement(By.id("nav-search-submit-button")).click();

		// driver.findElement(By.cssSelector("input.nav-input
		// nav-progressive-attribute")).click();

		// Scroll down the page- use javascript executor
		// By pixels

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");

		// find Elements

		// driver.findElements(By.cssSelector(null))
		// to element
		// page end
		// horizontal scroll (not used frequently)

		// Get title of the first product
		// List<WebElement> results = driver
		// .findElements(By.xpath("//span[@class='a-size-medium a-color-base
		// a-text-normal']"));

		// System.out.println(results.size());
		// for (int i = 0; i < results.size(); i++) {
		// System.out.println(results.get(i).getText());
		// }
		// System.out.println(results.get(0).getText());

	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("edge"))

		{
			System.setProperty("webdriver.edge.driver", "C:\\Driver\\Selenium_New\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Driver\\\\Selenium_New\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("http://www.amazon.in");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
