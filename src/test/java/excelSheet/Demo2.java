package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {
	
	public static void main(String[] args) throws IOException {
		//locate excel file
		FileInputStream files = new FileInputStream("D:\\Tech Bodhi Course\\Automation Testing\\Selenium\\6-12 Excel Reading\\Excel reading demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(files);//To read excel
		XSSFSheet sheet = workbook.getSheet("Fruits");//to read sheet
		int totalNumberOfRows = sheet.getLastRowNum();//gets total no. of rows(heading row is considered as zero)
		short totalcolNum = sheet.getRow(1).getLastCellNum();//gets total no. of columns
		
		System.out.println("Total Number of Rows " +totalNumberOfRows);
		System.out.println("Total Number of Columns " +totalcolNum);
		
		//printing data using Nested forLoop
		//Rows are present inside sheet.Columns are present inside Rows.
		for(int r=0;r<=totalNumberOfRows;r++) {
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0;c<totalcolNum;c++) {
				XSSFCell currentCells = currentRow.getCell(c);
				System.out.println(currentCells.toString()+ " ");
			}
			System.out.println();
		}
		
		workbook.close();
		files.close();

	}

}
