package Testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex1 
{
   @Test(priority=2,invocationCount=2)
    public void CreateUser()
    {
	Reporter.log("create user", true);
    }
   @Test(priority=3)
   public void deleteUser()
   {
	   Reporter.log("Delete User",true);
   }
   @Test(priority=1)
   public void edituser()
   {
	   Reporter.log("Edit user",true);
   }
}
