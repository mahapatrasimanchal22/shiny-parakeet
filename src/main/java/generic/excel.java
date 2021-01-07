package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel implements autocon {

	public static String getcell(String path, String sheet, int cell, int row ) throws IOException {
		
		FileInputStream fis=new FileInputStream(excel_path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	String CellValue = wb.getSheet(sheet).getRow(cell).getCell(row).getStringCellValue();
	
	return CellValue;
	
	}

}
