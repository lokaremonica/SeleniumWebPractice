package Testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softass 
{
@Test
public void testt()
{
  SoftAssert a1 = new SoftAssert();
  Reporter.log("soft assert",true);
  a1.assertEquals("ab", "b");
  Reporter.log("completed",true);
  a1.assertAll();
}
}
