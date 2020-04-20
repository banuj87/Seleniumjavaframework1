package utils;

public class Excel_utilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String projectPath=System.getProperty("user.dir");
		Excel_Utils excel =new Excel_Utils(projectPath+"/excel/data.xlsx", "Sheet1");
		excel.GetRowCount();
		excel.GetCellDataString(0, 0);
		excel.GetCellDataNumeric(1, 1);
	}

}
