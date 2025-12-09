package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadRow {

	public static void main(String[] args) throws IOException  {
		FileInputStream files = new FileInputStream
				("D:\\Tech Bodhi Course\\Automation Testing\\Selenium\\6-12 Excel Reading\\Excel reading demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(files);
		XSSFSheet sheet = workbook.getSheet("Fruits");
		XSSFRow row = sheet.getRow(1);
		short totalcells = row.getLastCellNum();
		for(int r=0;r<=totalcells;r++) {
			XSSFCell cell = row.getCell(r);
			System.out.println(cell.toString());
		}
	}

}
