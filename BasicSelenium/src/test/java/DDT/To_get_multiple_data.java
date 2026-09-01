package DDT; 
import java.io.FileInputStream; 
import java.io.IOException; 
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook; import org.apache.poi.ss.usermodel.WorkbookFactory; 
import org.testng.annotations.Test;
public class To_get_multiple_data {
	@Test 
	public void ddt() throws EncryptedDocumentException, IOException {
		//create object for FileInputStream class and pass file path with name and extention 
		FileInputStream fis = new FileInputStream("C:\\Users\\manik\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\TestData.xlsx");
		
		//call create() to open excel file and store in local variable 
		Workbook wb = WorkbookFactory.create(fis); 
		
		//call getsheet() and pass sheet name
		Sheet sheet = wb.getSheet("Sheet1"); 
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++) {
			Row row = sheet.getRow(i);
			
			String column1data=row.getCell(0).toString();
			String column2data=row.getCell(1).toString();
			System.out.println(column1data);
			}
		wb.close();
			}
		

}
