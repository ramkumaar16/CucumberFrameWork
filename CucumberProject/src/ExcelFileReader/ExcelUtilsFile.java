package ExcelFileReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsFile {

	static String Projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtilsFile(String excelPath, String sheetName){
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet =workbook.getSheet(sheetName);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 	
	}
	public static void main(String[] args) {
		
		//getRowCount();
		getCelldataString(0, 0);
	}	
	public static int getRowCount(){	
		int rowCOunt=0;
		try{
		 rowCOunt = sheet.getPhysicalNumberOfRows();
		System.out.println("getRows:"+rowCOunt);
		}
        catch(Exception exp){
        	System.out.println(exp.getMessage());
        	System.out.println(exp.getCause());
        	exp.printStackTrace();
        }
		return rowCOunt;
	}
	
public static int getcolCount(){	
	int colCount = 0;
		try{
		 colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("getcols:"+colCount);
		}
        catch(Exception exp){
        	System.out.println(exp.getMessage());
        	System.out.println(exp.getCause());
        	exp.printStackTrace();
        }
		return colCount;
	}
    
	public static String getCelldataString(int rowNum,int colNum){
		
		String celldata = null ;
		    try {
				 celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
				System.out.println("getcell:"+celldata);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			return celldata;
	}
	
	public static void getCelldataNumeric(int rowNum,int colNum){
		
	    try {
		    double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("getcell:"+celldata);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
}
	
	
}
