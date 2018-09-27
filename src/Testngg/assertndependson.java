package Testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertndependson 
{
@Test(priority=3,invocationCount=2)
public void registeruser()
{
	Reporter.log("registeruser",true);
}
@Test(enabled = false)
public void skip()
{
	Reporter.log("skip");
}
@Test(priority=2,dependsOnMethods={"registeruser"})
public void edit()
{
Reporter.log("depends",true);	
}

}
