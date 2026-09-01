package Utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetname, int rownum, int cellnum) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\TestCaseVtiger.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		wb.close();
		fis.close();
		return data;		
	}
	
public String getDataFromExcelVtiger(String sheetname, int rownum, int cellnum) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\TestCaseVtiger.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		wb.close();
		fis.close();
		return data;
		
	}
	
 public int getRowCount(String sheetname) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\TestCaseVtiger.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		int rowcount= wb.getSheet(sheetname).getLastRowNum();
		
		wb.close();
		fis.close();
		return rowcount;
}

public void setDataBackToExcel(String sheetname, int rownum, int cellnum, String data) throws Exception {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\TestCaseVtiger.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(rownum).createCell(cellnum);
	
	FileOutputStream fos= new FileOutputStream("C:\\Users\\manik\\eclipse-workspace\\Advance_Selenium\\src\\main\\resources\\TestCaseVtiger.xlsx");
	wb.write(fos);
	wb.close();
	fis.close();
	fos.close();
}
}
