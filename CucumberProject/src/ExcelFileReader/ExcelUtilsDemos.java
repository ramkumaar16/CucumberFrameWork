package ExcelFileReader;

public class ExcelUtilsDemos {

	public static void main(String[] args) {
		
		String Projectpath = System.getProperty("user.dir");
		ExcelUtilsFile excel = new ExcelUtilsFile(Projectpath+"/excel/data1.xlsx","Sheet1");
		excel.getRowCount();
		excel.getCelldataString(0, 1);
	}
	
	
}
