package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFileReader {
	static int rowCount;
	public static void getRows() throws Exception {
		String excelPath="./ExcelSheets/Details.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No. of Rows "+rowCount);

		}
		public static String getData(int row_num, int cell_num) throws Exception {
		File file = new File("./ExcelSheets/Details.xlsx");
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		String value= sheet.getRow(row_num).getCell(cell_num).getStringCellValue();
		return value;
		}
		public static String getStringValue(String str) throws Exception {
			String str1="";
			for(int i=0;i<=rowCount;i++) {
				if(getData(i,0)==str) {
					str1=getData(i,1);
				}
			}
			return str1;
		}
}
