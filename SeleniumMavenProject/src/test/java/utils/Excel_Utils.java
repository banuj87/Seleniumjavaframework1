package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.DATA_CONVERSION;

public class Excel_Utils {

	static String projectPath ;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;



	public Excel_Utils(String excelPath, String SheetName){


		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(SheetName);

		} catch (Exception e) {
			//System.out.println("Messages is " +e.getMessage());
			//System.out.println("Cause is " +e.getCause());
			e.printStackTrace();
		}

	}



	/*public static void main(String[] args) {
		//GetRowCount();
		GetColCount();
		GetCellDataString(0,0);
		//GetCellDataNumeric(1,1);
		 * 
		 * }
		*/

	
	public static int GetColCount() {
         int colCount=0;
		try {

			colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("col Count "+colCount);
		} catch (Exception e) {
			//System.out.println("Messages is " +e.getMessage());
			//System.out.println("Cause is " +e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
	

	public static int GetRowCount() {
		int rowCount=0;
		try {

			rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count "+rowCount);
		} catch (Exception e) {
			//System.out.println("Messages is " +e.getMessage());
			//System.out.println("Cause is " +e.getCause());
			e.printStackTrace();
			}
		return rowCount;
	}
	public static String GetCellDataString(int rowNum, int colNum) {

		String cellData=null;
		
		try {

			cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			e.printStackTrace();

		}
		  return cellData;

	}

	public static void GetCellDataNumeric(int rowNum, int colNum) {

		try {

			double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println( cellData);
		} catch (Exception e) {
			//System.out.println( e.getMessage());
			//System.out.println(e.getCause());
			e.printStackTrace();
		}


	}
















}
