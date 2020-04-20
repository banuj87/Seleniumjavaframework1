package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import org.testng.ITestListener;

public class TestNGListeners implements ITestListener  {




	public void onTestStart(ITestResult result) {  

		System.out.println("****** Test Started "+result.getName());
	}  


	public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("***** Test is successful : "+result.getName());  
	}  


	public void onTestFailure(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("***** Test fialed : "+result.getName());  
	}  


	public void onTestSkipped(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("***** Test Skipped : "+result.getName());  
	}    
	


	public void onFinish(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Completed : "+result.getName());  
	}  

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		// TODO Auto-generated method stub  
		//System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  


	public void onStart(ITestContext context) {  
		// TODO Auto-generate


	}
}
