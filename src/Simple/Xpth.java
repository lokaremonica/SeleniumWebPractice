package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpth 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver fd = new FirefoxDriver();
	fd.get("https://Google.com");
	fd.navigate().to("https://www.seleniumhq.org/");
	fd.findElement(By.id("menu_download")).click();
	fd.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[4]/a[1]")).click();
	
	
}
}
