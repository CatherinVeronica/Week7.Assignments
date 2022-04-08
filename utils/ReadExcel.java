package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getData(String excelfilepath) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook(excelfilepath);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		short colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);

		String[][] data = new String[rowcount][colcount];
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow eachrow = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {

				XSSFCell eachcell = eachrow.getCell(j);
				
							String value = eachcell.getStringCellValue();
							
							
				data[i - 1][j] = value;
			}

		}
		book.close();
		return data;

	}

}
