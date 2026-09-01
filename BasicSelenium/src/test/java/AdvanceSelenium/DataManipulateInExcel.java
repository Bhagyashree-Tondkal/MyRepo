package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataManipulateInExcel {
	
	public void readData() throws Exception {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	
	Row ro = sheet.getRow(1);
	 
	 //call getCell() and pass cell number
	 Cell c =ro.getCell(0);
	 
	 //cell getCell() and pass cell number
	 System.out.println(c.toString()); 
	 wb.close();
	}
	
	
	
	public void writeData() throws Exception {

	    FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\TestData.xlsx");

	    Workbook wb = WorkbookFactory.create(fis);

	    Sheet sh = wb.getSheet("Sheet1");

	    Row r = sh.createRow(4);

	    r.createCell(0).setCellValue("IBM");
	    r.createCell(1).setCellValue("bnmcv");
	    r.createCell(2).setCellValue("qwerty");

	    
	    FileOutputStream fos = new FileOutputStream(
	            "C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\TestData.xlsx");

	    wb.write(fos);

	    fos.close();
	    wb.close();
	}

	public static void main(String[] args) throws Exception {
		DataManipulateInExcel d = new DataManipulateInExcel();
		d.readData();
		d.writeData();
	}
	

}
