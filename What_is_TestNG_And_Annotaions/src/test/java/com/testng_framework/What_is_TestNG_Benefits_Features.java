package com.testng_framework;

public class What_is_TestNG_Benefits_Features 
{

	public static void main(String[] args)
	{

	// What is TestNG?
	
		
		/*TestNG is an automation testing framework in which NG stands for "Next Generation". 
		TestNG is inspired from JUnit which uses the annotations (@).

		Using TestNG you can generate a proper report, and you can easily come to know how many test cases are passed, failed and skipped.
		You can execute failed test case separately.
		
		For example.
		Suppose, you have five test cases, one method is written for each test case (Assume that the program is written using the main method without using testNG). When you run this program first, three methods are executed successfully, and the fourth method is failed. Then correct the errors present in the fourth method, now you want to run only fourth method because first three methods are anyway executed successfully. 
		This is not possible without using TestNG.
		
		The TestNG provides an option, i.e., testng-failed.xml file in test-output folder.
		If you want to run only failed test cases means you run this XML file. 
		It will execute only failed test cases.
		
		Beside above concept, you will learn more on TestNG, like what are the Advantages of TestNG, how to create test methods using @test annotations, how to convert these classes into testing suite file and execute through the eclipse as well as from the command line.

*/	
	
 // Why Use TestNG with Selenium?
		
		/*Default Selenium tests do not generate a proper format for the test results. Using TestNG we can generate test results.

		Most Selenium users use this more than Junit because of its advantages. There are so many features of TestNG, but we will only focus on the most important ones that we can use in Selenium. Following are key features of TestNG

		1.Generate the report in a proper format including a number of test cases runs, the number of test cases passed, the number of test cases failed, and the number of test cases skipped.
		2.Multiple test cases can be grouped more easily by converting them into testng.xml file. In which you can make priorities which test case should be executed first.
		3.The same test case can be executed multiple times without loops just by using keyword called 'invocation count.'
		4.Using testng, you can execute multiple test cases on multiple browsers, i.e., cross browser testing.
		5.The testing framework can be easily integrated with tools like Maven, Jenkins, etc.
		6.Annotations used in the testing are very easy to understand ex: @BeforeMethod, @AfterMethod, @BeforeTest, @AfterTest
		7.WebDriver has no native mechanism for generating reports. TestNG can generate the report in a readable format like the one shown below.
		8.TestNG Tutorial: Install, Annotations, Framework, Examples in SELENIUM
		9.TestNG simplifies the way the tests are coded. There is no more need for a static main method in our tests. The sequence of actions is regulated by easy-to-understand annotations that do not require methods to be static.
		10.Uncaught exceptions are automatically handled by TestNG without terminating the test prematurely. These exceptions are reported as failed steps in the report.
		 */		
		
 // Advantages of TestNG over JUnit
		
		/*There are three major advantages of TestNG over JUnit:
			
			1.Annotations are easier to understand
			2.Test cases can be grouped more easily
			3.Parallel testing is possible
		*/
		}
	
	

}
