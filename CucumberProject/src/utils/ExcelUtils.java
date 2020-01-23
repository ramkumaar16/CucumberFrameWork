package utils;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook; 
	static XSSFSheet sheet ;
	
	public  ExcelUtils(String excelPath,String sheetName){
		try{
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
		//getrowcount();
		getcelldataString(1, 1);
		//getcelldataNumeric();
	}

	public static int getrowcount(){
        
		int rowCount =0;
		
		try{
			
		    rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("RowCount:"+rowCount);
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return rowCount;

	}
	

	public static int getcolcount(){
		
		int colCount = 0;
		try{
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("RowCount:"+colCount);
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return colCount;

	}

	public static String getcelldataString(int rowNum,int columnNum){
		
		try{
			
			 String cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			//System.out.println("CelCount:"+cellData);
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return projectpath;
     
	 

	}


	/*public static void getcelldataNumeric(){
		try{
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/excel/data1.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double celldata1 = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println("CelCount:"+celldata1);
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}*/
}
