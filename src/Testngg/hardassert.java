package Testngg;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hardassert 
{
@Test
public void hardass()
{
	Reporter.log("test",true);
	String ac = "abc";
	String ep = "abc";
	Assert.assertEquals(ac, ep);
}
}
