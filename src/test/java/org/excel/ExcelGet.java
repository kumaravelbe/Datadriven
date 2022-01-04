package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelGet {
	public static void main(String[] args) throws IOException {
	
		File f=new File("C:\\WorkSpace\\DataDriven\\Excel\\file_example_XLS_10.xls");
	
		FileInputStream fin =new FileInputStream(f);
		
		Workbook b=new HSSFWorkbook(fin);
				
		Sheet sh=b.getSheet("Sheet1");
		
		Row r = sh.getRow(2);
		
		Cell c = r.getCell(2);
		
		System.out.println(r.getPhysicalNumberOfCells());
		
		System.out.println(c);
		
		
		
		
		
		
		
	}
	
	
	
}
