package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
// linked to Test0.java file
public class Test4 implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("on test starts",true);
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("on test Success",true);
		
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("on test Failure",true);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("on test Skipped",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("on test Failed But Within Success Percentage",true);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on test Failed With Timeout",true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("on Start of the test case",true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("on Finish of the test case",true);
	}
	

}
