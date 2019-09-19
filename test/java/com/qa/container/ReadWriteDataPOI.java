package com.qa.container;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteDataPOI {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\ZEESHAN\\Documents\\GIT\\Data.xlsx";
		FileInputStream fis = new FileInputStream(path);

		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;
		XSSFRow row;

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheet("details");
		cell = sheet.getRow(1).getCell(1);
		String cell_11 = cell.getStringCellValue();
		System.out.println(cell_11);
	}

}
