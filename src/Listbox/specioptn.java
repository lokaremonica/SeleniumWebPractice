package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class specioptn 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Monica/Desktop/sam.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String ev = "India";
	WebElement ll = driver.findElement(By.id("CountrySelect"));
     Select ss = new Select(ll);
    int count = ss.getOptions().size();
    for (int i=0; i<count; i++)
    {
    	String cv = ss.getOptions().get(i).getText();
    	if (cv.equals(ev))
    	{
    		System.out.println("Found");
    		break;
    	}
    	else
    	{
    		System.out.println("Not Found");
    	}
    
    }
}
}
