package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestWritePOI {

	private static final String FILE_NAME = "C:/seleniumIO/testAPI.xlsx";

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Data Types in Java");

		System.out.println(sheet.getSheetName());

		Object[][] dataTypes = {
				{"DataTypes", "Type", "Size(in bytes)"},
				{"int", "Primitive", 2},
				{"float", "Primitive", 4},
				{"double", "Primitive", 8.22},
				{"char", "Primitive", 1},
				{"String", "Non-Primitive", "No fixed size"}

		};

		int rowNum=0;
		System.out.println("Creating excel");

		for(Object[] datatype : dataTypes){
			Row row = sheet.createRow(rowNum++);
			int colNum = 0;
			for(Object field : datatype){
				Cell cell = row.createCell(colNum++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}else if (field instanceof Double) {
					cell.setCellValue((Double)field);
				}
			}


		}

		try{
			FileOutputStream fOut = new FileOutputStream(FILE_NAME);
			wb.write(fOut);
			wb.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Done");
	}

}
