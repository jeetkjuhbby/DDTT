package Test;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class J_01_data_driven {
	
	static String projectPathString;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) throws IOException {
		getCount();
		getCellData();
	}

	public static void getCount() throws IOException {
		
		projectPathString= System.getProperty("user.dir");
        workbook = new XSSFWorkbook(projectPathString +"/excel/data.xlsx");
		sheet = workbook.getSheet("Sheet1");
		int rowCount =sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows: "+ rowCount);
		
	}
	
	public static void getCellData() throws IOException {
		projectPathString= System.getProperty("user.dir");
        workbook = new XSSFWorkbook(projectPathString +"/excel/data.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
		double usernameNumeric = sheet.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(cellData);
		System.out.println(usernameNumeric);
	}

}
