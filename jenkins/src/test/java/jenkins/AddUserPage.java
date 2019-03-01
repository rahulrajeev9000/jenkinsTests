package jenkins;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;



public class AddUserPage {

WebDriver driver;
	
	@Parameters
	public static Collection<Object[]> data() throws IOException {
		
		
		FileInputStream file = new FileInputStream(Constants.xFile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
	
		Object[][] user = new Object[sheet.getPhysicalNumberOfRows()][5];
		for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
			user[rowNum][0] =sheet.getRow(rowNum).getCell(0).getStringCellValue();
			user[rowNum][1] =sheet.getRow(rowNum).getCell(0).getStringCellValue();
			user[rowNum][2] =sheet.getRow(rowNum).getCell(0).getStringCellValue();
			user[rowNum][3] =sheet.getRow(rowNum).getCell(0).getStringCellValue();
			}
		workbook.close();
		return Arrays.asList(user);
	}
	
	
	
}
