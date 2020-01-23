
package utils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectpath+"/excel/data1.xlsx","Sheet1");
		excel.getrowcount();
		excel.getcelldataString(0, 0);
		
		
	}

}
