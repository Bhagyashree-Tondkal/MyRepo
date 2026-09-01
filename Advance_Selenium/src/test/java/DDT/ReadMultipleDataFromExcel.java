package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args, Object Row) throws Exception {
		//create object for FileInputStream class and pass file path with name and extention 
		FileInputStream fis = new FileInputStream(
		        "C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\TestCaseVtiger (1).xlsx");

		// Open Excel file
		Workbook wb = WorkbookFactory.create(fis);

		// Open sheet
		Sheet sheet = wb.getSheet("ORG");

		// Get last row number
		int rowcount = sheet.getLastRowNum();

		// Read all rows
		for (int i = 1; i <= rowcount; i++) {

		    Row row = sheet.getRow(i);

		    String col1data = row.getCell(0).toString();
		    String col2data = row.getCell(1).toString();

		    System.out.println(col1data);
		    System.out.println(col2data);
		}

		wb.close();
		fis.close();
		       
		
	}

}
