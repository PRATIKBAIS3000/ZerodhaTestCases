package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(int row, int cell, String sheet) throws IOException {

		FileInputStream file = new FileInputStream("D:\\Selenium\\KiteZerodha\\src\\test\\resources\\TestData.xlsx");

		String value = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

		return value;

	}
}
