package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datadriven 
{

	public static void loginlogout(String un, String pw) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
		System.out.println(" "+un+pw);
	}
	
	public static void main(String[] args) throws IOException, InvalidFormatException, InterruptedException
	{
		// TODO Auto-generated method stub
	 FileInputStream fi = new FileInputStream("D:\\uspw.xlsx");
	 	Workbook wb = WorkbookFactory.create(fi);
	 		Sheet s1 = wb.getSheet("Sheet1");
	 		int rr = s1.getLastRowNum();
	 		for (int i =1;i<=rr;i++)
	 		{
	 			String un = s1.getRow(i).getCell(0).getStringCellValue();
	 			String pw = s1.getRow(i).getCell(1).getStringCellValue();
	 			loginlogout(un,pw);
	 		}
	 		
	}

}
