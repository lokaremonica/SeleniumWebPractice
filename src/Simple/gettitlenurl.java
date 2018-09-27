package Simple;

import org.openqa.selenium.firefox.FirefoxDriver;

public class gettitlenurl 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver fd = new FirefoxDriver();
	fd.get("https://demo.actitime.com/login.do");
	String tt = fd.getTitle();
	if (tt.equalsIgnoreCase("actiTIME - Login"))
	{
		System.out.println("Title is"+tt);
	}
	else 
	{
		System.out.println("Title does not match");
	}
	String uu = fd.getCurrentUrl();
	System.out.println("Url is"+uu);
}
}
