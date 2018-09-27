package Popup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childbrows {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naukri.com/");
		Set<String> a = driver.getWindowHandles();
		
		//to check window present or not
		/*Iterator<String> b = a.iterator();
		boolean w1 = b.hasNext();
		System.out.println(w1);
		String s1 = b.next();
		System.out.println(s1);
		boolean w2 = b.hasNext();
		System.out.println(w2);
		String s2 = b.next();
		System.out.println(s2);
		*/
		
		//to check the no of windows		
		/*System.out.println(a.size());
		for(String b: a)
		{
			System.out.println(b);
		}
		*/
		
		//to close a amazon child browser
		/*for (String b : a)
		{
			  driver.switchTo().window(b);
			 String tt = driver.getTitle();
			 if (tt.equalsIgnoreCase("Amazon"))
			 {
				 driver.close();
			 }
			 */
		
		//to close all browser without using quit
		/*for (String b : a)
		{
			driver.switchTo().window(b);
			driver.close();		
				
		}
		*/
		Iterator<String> b = a.iterator();

		
			String pp = b.next();
			
			while(b.hasNext())
			{
				String cc = b.next();
			driver.switchTo().window(cc);
			driver.close();
			}	
		
		
	}

}
