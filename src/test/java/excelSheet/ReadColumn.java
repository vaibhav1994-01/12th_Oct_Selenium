package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadColumn {

	public static void main(String[] args) throws IOException {
		FileInputStream files = new FileInputStream
				("D:\\Tech Bodhi Course\\Automation Testing\\Selenium\\6-12 Excel Reading\\Excel reading demo.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(files);
				XSSFSheet sheet = workbook.getSheet("Fruits");
				int totalNumRows = sheet.getLastRowNum();
				
				System.out.println("Total Number of Rows: "+totalNumRows);
				for(int r=0;r<=totalNumRows;r++) {
					XSSFRow row = sheet.getRow(r);
					if(row != null) {
						XSSFCell cell = row.getCell(0);
						
						if(cell != null) {
							System.out.println(cell.toString());
						}
					}
				}

	}

}
