package frameworkint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import POM.BasePage;
import POM.Loginpage;

public class actionsloginlogout extends supertestng 
{
	@Test
	public void testloginlogout() throws IOException,InvalidFormatException,InterruptedException,NullPointerException
	{
		FileInputStream fis = new FileInputStream("D:\\uspw.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		 Sheet sht = wb.getSheet("Sheet1");
		  	int slc = sht.getLastRowNum();
		  	for(int i=1; i<=slc;i++)
		  	{
		  		String un = sht.getRow(i).getCell(0).getStringCellValue();
		  		String pw = sht.getRow(i).getCell(1).getStringCellValue();
		  		System.out.println(un+" "+pw);
		  		new Loginpage(driver).login(un,pw);
		  		Thread.sleep(5000);
		  		new BasePage(driver).logout();
		  		Thread.sleep(5000);
		  	}
		  	
	}
}
