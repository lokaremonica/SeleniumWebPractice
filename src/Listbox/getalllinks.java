package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getalllinks 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.gsmarena.com/nokia-phones-1.php");
	 List<WebElement> Alinks = driver.findElements(By.xpath("//li/a"));
	int cc = Alinks.size();
	System.out.println(cc);
	for (int i=0; i<cc; i++)
	{
		String tt = Alinks.get(i).getText();
		System.out.println(tt);
	}
	}
}
