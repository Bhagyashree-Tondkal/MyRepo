package AdvanceSelenium;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelUtility {

	    String path = "C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\TestData.xlsx";

	    // Read data from Excel
	    public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {

	        FileInputStream fis = new FileInputStream(path);
	        Workbook wb = WorkbookFactory.create(fis);

	        Sheet sheet = wb.getSheet(sheetName);
	        Row row = sheet.getRow(rowNum);
	        Cell cell = row.getCell(cellNum);

	        String data = cell.toString();

	        wb.close();
	        fis.close();

	        return data;
	    }

	    // Write data to Excel
	    public void writeDataToExcel(String sheetName, int rowNum, int cellNum, String value) throws Exception {

	        FileInputStream fis = new FileInputStream(path);
	        Workbook wb = WorkbookFactory.create(fis);

	        Sheet sheet = wb.getSheet(sheetName);

	        Row row = sheet.getRow(rowNum);

	        if (row == null) {
	            row = sheet.createRow(rowNum);
	        }

	        Cell cell = row.getCell(cellNum);

	        if (cell == null) {
	            cell = row.createCell(cellNum);
	        }

	        cell.setCellValue(value);

	        fis.close();

	        FileOutputStream fos = new FileOutputStream(path);
	        wb.write(fos);

	        fos.close();
	        wb.close();
	    }

	    public static void main(String[] args) throws Exception {

	        ExcelUtility eu = new ExcelUtility();

	        // Read data
	        String data = eu.readDataFromExcel("Sheet1", 2, 2);
	        System.out.println("Before Writing : " + data);

	        // Write data
	        eu.writeDataToExcel("Sheet1", 2, 2, "IBM");

	        // Read again
	        String newData = eu.readDataFromExcel("Sheet1", 2, 2);
	        System.out.println("After Writing : " + newData);
	    }
	    
	    public String getExcelData(String sheetName,int row,int cell) throws Exception
	    {
	        FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\TestData.xlsx");

	        Workbook wb = WorkbookFactory.create(fis);

	        String data = wb.getSheet(sheetName)
	                        .getRow(row)
	                        .getCell(cell)
	                        .toString();

	        wb.close();

	        return data;
	    }

	
	}


