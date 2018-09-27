package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class reading 
{

	public static void main(String[] args)throws  IOException, EncryptedDocumentException, InvalidFormatException 
	{
		// TODO Auto-generated method stub
			
				FileInputStream mk = new FileInputStream("D:\\Sample.xlsx");
				Workbook wbb = WorkbookFactory.create(mk);
						Sheet s1 = wbb.getSheet("Sheet1");
						Row rr1 = s1.getRow(1);
						Cell cc1 = rr1.getCell(1);
						Enum<CellType> cel_Type = cc1.getCellType();                           
	                  if (cel_Type.toString()!= null)
	                  {
	                	  System.out.println(cc1.getNumericCellValue()); 
	                  }
	                  else
	                  {
	                	  System.out.println(cc1.getStringCellValue());
	                  }
						/*switch(cel_Type) 
	                    {
	                    case 0: System.out.print(cc1.getNumericCellValue()+ " ");
	                            break;
	                    case 1:System.out.print(cc1.getStringCellValue()+" ");
	                            break;
	                    case 4: System.out.print(cc1.getBooleanCellValue()+" ");
	                            break;
	                    case 3:
	                            System.out.print(" "+" ");
	                            break; 
	                    default:
	                            System.out.print("inside the default..");
	                    }
	                    */
						String un = s1.getRow(0).getCell(0).getStringCellValue();
						System.out.println(un);
	}
}
