package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCell {

	public static void main(String[] args) throws IOException {
		FileInputStream files = new FileInputStream
		("D:\\Tech Bodhi Course\\Automation Testing\\Selenium\\6-12 Excel Reading\\Excel reading demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(files);
		XSSFSheet sheet = workbook.getSheet("Fruits");
		XSSFRow row = sheet.getRow(5);
		XSSFCell cell = row.getCell(1);
		
		System.out.println(cell.toString());
	}

}
