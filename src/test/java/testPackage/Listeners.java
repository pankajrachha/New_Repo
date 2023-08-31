package testPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) 
    {  
     System.out.println("Test case is going to execute "+result.getName());
    }  

     public void onTestSuccess(ITestResult result) {  

     System.out.println("Success of test cases and its details are : "+result.getName());  
     }  

     public void onTestFailure(ITestResult result) {  

	    System.out.println("****************************************************");
	    System.out.println("Failure of test cases and its details are : "+result.getName());
	    System.out.println("****************************************************");
     }  

     public void onTestSkipped(ITestResult result) {  

     System.out.println("Skip of test cases and its details are : "+result.getName());  
     }  

     public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  

     System.out.println("Failure of test cases within in success percentage and its details are : "+result.getName());  
     }  

     public void onStart(ITestContext context) {  
         System.out.println("Before everything"); 
     }  

     public void onFinish(ITestContext context) { 
         System.out.println("After everything"); 

     }  

}
