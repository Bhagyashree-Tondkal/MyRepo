package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {
	public static void main(String[] args) throws Exception, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		 
		 //call getCell() and pass cell number
		 Cell cell = row.getCell(2);
		 
		 //cell getCell() and pass cell number
		 System.out.println(cell.toString());
		 
		 wb.close();
	}

}
