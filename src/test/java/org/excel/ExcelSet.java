package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSet {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\WorkSpace\\DataDriven\\Excel\\sample.xls");
		Workbook b=new XSSFWorkbook();
		
		Sheet s = b.createSheet("Sample");
		
		Row r = s.createRow(0);
		
		 r.createCell(0).setCellValue("1234");
		 r.createCell(1).setCellValue("kumar");
		 FileOutputStream fout =new FileOutputStream(f);
		 b.write(fout);
		
		System.out.println("done");
		
		
	}
	
	
	
	
}
