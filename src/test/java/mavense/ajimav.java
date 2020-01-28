package mavense;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ajimav {
	public static void main(String[] args) throws Throwable {
		//locating excel path
		File loc=new File("D:\\New Folder\\maven excel.xlsx");
		//read excel
		FileInputStream st=new FileInputStream(loc);
		//access worksheet
		Workbook w=new XSSFWorkbook(st);
		//getting sheet
	Sheet s=w.getSheet("ajith");
		//getting row
	Row r=s.getRow(1);
	// getting cell
	Cell c=r.getCell(2);
	System.out.println(c);
	}

}
