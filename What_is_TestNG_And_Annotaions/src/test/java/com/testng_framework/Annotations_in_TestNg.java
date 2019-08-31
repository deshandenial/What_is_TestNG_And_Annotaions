package com.testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations_in_TestNg
{

// What is Annotation?
	
	/*Annotation is repeatedly used by developers to describe a piece of code that is inserted into the program or business logic used to control the flow of methods in the programming language Java. 
	Annotations play a major role in Test Next Generation (TestNG), an automation framework widely used by Selenium.
	Annotations differ from project to project depending on their requirements. 
	Though the requirements change, the execution flow will be the same for every single project
	*/
	
// The following are TestNG annotations, with explanations and examples for each below.
	
	/*@BeforeSuite
	@BeforeTest
	@BeforeClass
	@BeforeMethod
	@Test
	@AfterMethod
	@AfterClass
	@AfterTest
	@AfterSuite*/

// Workflow of TestNG
	
  @Test
  public void test() 
  {
	  
	// Workflow of TestNG: @Test
	  
	 /* In any automation script, @Test annotation is the important part, where we write code/business logic.
	  * If something needs to be automated, that particular code needs to be inserted into the test method.
	  * The test method then executes @Test by passing attributes. Here are some attributes that are used to pass in the test methods.

	  dependsOnGroups: In this attribute, we can get a group of the list to the particular method it depends on. 
	  Example: @Test (groups = { "Organization" ,"Employee" })
	   
	  alwaysRun: This attribute can be used whenever we get a situation to run a method continuously, even if the parameters of the process fail. 
	  Example: @Test(alwaysRun = true)
	   
	  dataProviderClass: dataProviderClass is class used to provide the data to the dataProvider, so let’s give the class name “Computer.”
	   
	  dataProvider: It is used for providing any data to the parameterization.
	  Example: @Test (dataProvider = "Computer")
	   
	  dependsOnMethods: Methods are used to execute its dependent method in the same way dependsOnMethods works.
	  Example: @Test (dependsOnMethods = { "start", "init" }) 
	  */
	  
	  System.out.println("Hai deshan....this block is @Test Annotaion");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	 // @BeforeMethod allows the method to execute before the execution of each @Test methods
	  System.out.println("hai deshan....this block is @BeforeMethod Annotaion");
	  
  }

  @AfterMethod
  public void afterMethod()
  {
	  // @afterMethod is executed after the execution of each @Test methods.
	  System.out.println("hai deshan....this block is @AfterMethod Annotaion");
	  
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  /*The method annotated with @BeforeClass will execute only once before the first test method in that particular class is invoked.
	  You can then initialize or configure set-up for all the conventional test methods. 
	  The @AfterClass annotation will be executed only once, after all the test methods of that particular class have been invoked.
	  In the below output, you can see that @BeforeClass and @AfterClass are executed at the very beginning and very end, so we can conclude that they are both used only once.
      */
	  System.out.println("hai deshan....this block is @Beforeclass Annotaion");
  }
  @AfterClass
  public void afterClass() 
  {
	  /*The method annotated with @BeforeClass will execute only once before the first test method in that particular class is invoked.
	  You can then initialize or configure set-up for all the conventional test methods. 
	  The @AfterClass annotation will be executed only once, after all the test methods of that particular class have been invoked.
	  In the below output, you can see that @BeforeClass and @AfterClass are executed at the very beginning and very end, so we can conclude that they are both used only once.
      */
	  System.out.println("hai deshan....this block is @Afterclass Annotaion");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  /*The @BeforeTest methods run after @beforeSuite. 
	  For frameworks like smoke testing, @BeforeTest is used for creating an initial data set up and prior to running other test methods, whereas @AfterTest annotation will run after the other tests are complete.
	   */
	  System.out.println("hai deshan....this block is @BeforeTest Annotaion");
  }

  @AfterTest
  public void afterTest() 
  {
	  /*The @BeforeTest methods run after @beforeSuite. 
	  For frameworks like smoke testing, @BeforeTest is used for creating an initial data set up and prior to running other test methods, whereas @AfterTest annotation will run after the other tests are complete.
	   */
	  System.out.println("hai deshan....this block is @AfterTest Annotaion");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	 /* With the help of @BeforeSuite annotation, we can set up and start the Selenium Webdrivers. 
	  The @AfterSuite annotation is used to stop the Selenium Webdrivers.*/
	  System.out.println("hai deshan....this block is @BeforeSuite Annotaion");
	  
  }

  @AfterSuite
  public void afterSuite()
  {
	  /* With the help of @BeforeSuite annotation, we can set up and start the Selenium Webdrivers. 
	  The @AfterSuite annotation is used to stop the Selenium Webdrivers.*/
	  System.out.println("hai deshan....this block is @AfterSuite Annotaion");
	  
  }

}
