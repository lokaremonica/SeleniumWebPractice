package Simple;

import org.openqa.selenium.firefox.FirefoxDriver;

public class backnrefresh 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver ff = new FirefoxDriver();
	Thread.sleep(6000);
	ff.get("https://Google.com");
	Thread.sleep(6000);
	ff.navigate().to("https://gmail.com");
	Thread.sleep(6000);
	ff.navigate().back();
	Thread.sleep(6000);
	ff.navigate().forward();
	Thread.sleep(6000);
	ff.navigate().refresh();
	Thread.sleep(6000);
	ff.quit();
}
}
