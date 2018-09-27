package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver fd = new FirefoxDriver();
	fd.get("https://demo.actitime.com/login.do");
	fd.findElement(By.id("username")).sendKeys("admin");
	fd.findElement(By.name("pwd")).sendKeys("manager");
	fd.findElement(By.id("loginButton")).click();
	Thread.sleep(6000);
	fd.findElement(By.id("logoutLink")).click();
	fd.close();	
}
}
