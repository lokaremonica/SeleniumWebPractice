package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class rowsncells {

	public static void main(String[] args) throws IOException,InvalidFormatException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\Sample.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet ss = wb.getSheet("Sheet1");
		int lr = ss.getLastRowNum();
		System.out.println("last row is"+lr);
		
		     for (int i=0; i<lr; i++)
		     {
		    	 short lc = ss.getRow(i).getLastCellNum();
		    	 System.out.println("last cell"+lc);
		     }
	}

}
