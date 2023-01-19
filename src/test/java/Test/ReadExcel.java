package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\HD149PQ\\eclipse-workspace\\selenium\\TestNG\\DataSource.xls");
		FileInputStream fis = new FileInputStream(file);
		// for horrible spreadsheet(HSSF) format for .xls format.For .xlsz format its
		// xssf
		HSSFWorkbook wb = new HSSFWorkbook(fis);

		// by default index is 0 and sheet1 will be taken.same can be accessed using
		// sheet name as well by giving the sheet sname.
		HSSFSheet sh = wb.getSheetAt(0);

		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		System.out.println("Row count is " + rowCount);
		int cellCount = sh.getRow(1).getLastCellNum();
		System.out.println("Cell count is " + cellCount);

		String arr[][] = new String[rowCount + 1][cellCount];
		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				arr[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		// This piece of code is not required,its just to print...you can include print
		// satement in above loop as well
		for (int k = 0; k < arr.length; k++) {
			for (int l = 0; l < cellCount; l++) {
				System.out.print(arr[k][l] + ",");
			}
			System.out.println();
		}
	}

}
