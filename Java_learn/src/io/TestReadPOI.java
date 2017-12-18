package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestReadPOI {

	private static final String FILE_NAME =  "C:/seleniumIO/testAPI.xlsx";

	public static void main(String[] args){

		try {
			FileInputStream fIn = new FileInputStream(new File(FILE_NAME));
			Workbook wb = new XSSFWorkbook(fIn);
			Sheet sheet = wb.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()){
				Row row	= rowIterator.next();

				Iterator<Cell> cellIterator = row.iterator();

				while (cellIterator.hasNext()){
					Cell currentCell = cellIterator.next(); 

					if(currentCell.getCellTypeEnum() == CellType.STRING){
						System.out.println(currentCell.getStringCellValue());

					}else if (currentCell.getCellTypeEnum() == CellType.NUMERIC){
						System.out.println(currentCell.getNumericCellValue());

					}
				}
				System.out.println();
			}
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}


		}

	}
