package Com.Sample.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public  static String readingData(int row_num, int cell_num,boolean islogin) throws Exception {
        File file = new File(System.getProperty ("user.dir")+"\\Testdata\\Excellogin.xlsx");
        File file2= new File(System.getProperty ("user.dir")+"\\Testdata\\search.xlsx");
        FileInputStream inputStream ;
        if(islogin) {
        	 inputStream = new FileInputStream(file);
        }
        else {
        	 inputStream = new FileInputStream(file2);
        }
        
        
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        String value = sheet.getRow(row_num).getCell(cell_num).getStringCellValue();
        return value;
    
}
}