package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getvalue 
{

	public static void main(String[] args) throws IOException,InvalidFormatException,NullPointerException  
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				FileInputStream fis = new FileInputStream("D:\\Sample.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				Sheet ss = wb.getSheet("Sheet1");
				int lr = ss.getLastRowNum();
				System.out.println("last row is"+lr);
				
				for (int i=0;i<=lr; i++)
				{	
						 Row lc = ss.getRow(i);
						 if (lc != null)
						 {
							 short ff = lc.getLastCellNum();
						for (int j=0; j<ff; j++)
							{
								Cell dd = lc.getCell(j);
								if (dd != null) 
								{
							  CellType vv = dd.getCellType();
									
									switch(vv) 
					                    {
									
					                    case NUMERIC: System.out.print(dd.getNumericCellValue());
					                            break;
					                    case STRING:System.out.print(dd.getStringCellValue()+" ");
					                            break;
					                    case BOOLEAN: System.out.print(dd.getBooleanCellValue()+" ");
					                            break;					                
					                    case ERROR:
					                    	System.out.println("err");
					                    default:
					                            break;
					                    }
									
							}
				}	
	}
}
}
}