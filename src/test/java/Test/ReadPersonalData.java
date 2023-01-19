package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPersonalData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// WebDriver driver = new ChromeDriver();
		// driver.get("https://demoqa.com/automation-practice-form");
		File file = new File("C:\\Users\\HD149PQ\\eclipse-workspace\\selenium\\TestNG\\PersonalDetails.xls");
		FileInputStream fis = new FileInputStream(file);
		// for horrible spreadsheet(HSSF) format for .xls format.For .xlsz format its
		// xssf
		HSSFWorkbook wb = new HSSFWorkbook(fis);

		// by default index is 0 and sheet1 will be taken.same can be accessed using
		// sheet name as well by giving the sheet sname.
		HSSFSheet sh = wb.getSheetAt(0);
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		// System.out.println("Row count is " + rowCount);
		int cellCount = sh.getRow(1).getLastCellNum();
		// System.out.println("Cell count is " + cellCount);

		String values[] = new String[cellCount];
		String fname, lname, email, address, mobile, subject;

		// to print as numbers, not as double
		NumberFormat formatter = new DecimalFormat("0");

		fname = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.print(fname + " ");
		lname = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.print(lname + " ");
		email = sh.getRow(1).getCell(2).getStringCellValue();
		System.out.print(email + " ");
		mobile = formatter.format(sh.getRow(1).getCell(3).getNumericCellValue());
		System.out.print(mobile + " ");
		// subject = sh.getRow(1).getCell(4).getStringCellValue();
		// System.out.print(subject);
		address = sh.getRow(1).getCell(4).getStringCellValue();
		System.out.print(address + " ");

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("userNumber")).sendKeys(String.valueOf(mobile));
		// driver.findElement(By.id("subjectsContainer")).sendKeys(subject);
		driver.findElement(By.id("currentAddress")).sendKeys(address);

		/*
		 * String arr[][] = new String[rowCount + 1][cellCount]; NumberFormat formatter
		 * = new DecimalFormat("0.00000000000"); for (int i = 1; i <= rowCount; i++) {
		 * for (int j = 0; j < cellCount; j++) { if
		 * (sh.getRow(i).getCell(j).getCellType() == CellType.STRING) { arr[i][j] =
		 * sh.getRow(i).getCell(j).getStringCellValue(); System.out.print(arr[i][j] +
		 * ",");
		 * 
		 * } else {
		 * 
		 * double prr = sh.getRow(i).getCell(j).getNumericCellValue();
		 * formatter.format(prr); System.out.print(prr + ","); }
		 * 
		 * } System.out.println(); }
		 */

	}

}
