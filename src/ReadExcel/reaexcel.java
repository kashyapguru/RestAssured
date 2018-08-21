package ReadExcel;

import java.io.*;
import first.SimpleGetTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reaexcel{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\Tblocks\\automation\\FirstExcelFile.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		int rowCount = sh1.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) {
		
		int j = 0;	
		
		String city = (sh1.getRow(i).getCell(j).getStringCellValue());
		
		SimpleGetTest fetch = new SimpleGetTest();
		
		String response = fetch.GetWeatherDetails(city);
		
		System.out.println(response);
		
		}
		
		wb.close();
	}

}
