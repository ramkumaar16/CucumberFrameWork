package utils;

public class ExcelDataProvider {
	
	
	public static void main(String[] args) {
		
		String excelPath = "E:/TESTING/CucumberProject/excel/data1.xlsx";
		
	    ExcelUtils excel = new ExcelUtils(excelPath, "Sheet1");
		
		int rowcount =excel.getrowcount();
		int colcount =excel.getcolcount();
		
		for(int i=0; i<rowcount;i++){
			
			for(int j=0;j<colcount;i++){
				
				String 	CellData = excel.getcelldataString(i, j );
				System.out.print(CellData+" | ");
			}
		  System.out.println();
		
	}
	}
	
	public static  void testdata(String excelPath,String sheetName){
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowcount =excel.getrowcount();
		int colcount =excel.getcolcount();
		
		for(int i=0; i<rowcount;i++){
			
			for(int j=0;j<colcount;i++){
				
				String 	CellData = excel.getcelldataString(i, j );
				System.out.print(CellData+" | ");
			}
		  System.out.println();
		
	}

}
}