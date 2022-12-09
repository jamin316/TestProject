package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test (priority = 1)	 // create new user test@test.com
  public void createUser() {
	  System.out.println("I am in Home Test");
	  
	  System.out.println("Before Assertion"); 
	  Assert.assertTrue(2>3, "Verifying Element");		// we use regular assert in industry
	  System.out.println("After Assertion");
	  
	  Assert.assertEquals("abc", "abc"); 
  }
  
  @Test (priority = 2, dependsOnMethods = "createUser")	 // edit user test@test.com
  public void editUser() {
	
	  System.out.println("Before Assertion"); 
	  Assert.assertTrue(2>3, "Verifying Element");
	  System.out.println("After Assertion");
	  
	  softAssert.assertAll();	// works as Error Collector in JUnit
  }
  
  @Test (priority = 3, dependsOnMethods = "editUser")	 // delete user test@test.com
  public void deleteUser() {
	  
	  System.out.println("I am in Home Test");
	  
	  System.out.println("Before Assertion"); 
	  Assert.assertTrue(2>3, "Verifying Element");
	  System.out.println("After Assertion");
	  
	  Assert.assertEquals("abc", "abc1"); 
	  System.out.println("After second Assertion");
	  
	  softAssert.assertAll();
  }
  
  
}
