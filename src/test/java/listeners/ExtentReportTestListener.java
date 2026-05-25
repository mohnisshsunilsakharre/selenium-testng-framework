package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import utilities.ExtentReportsManager;
import utilities.ScreenshotUtil;

public class ExtentReportTestListener implements ITestListener {

	ExtentReports extent = ExtentReportsManager.getInstance();

	ExtentTest test;

	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {

		test.pass("Test Passed");

	}

	public void onTestFailure(ITestResult result) {

		test.fail(result.getThrowable());

		String path = ScreenshotUtil.captureScreenshot(BaseTest.getDriver(), result.getMethod().getMethodName());

		test.addScreenCaptureFromPath(path);

	}

	public void onFinish(org.testng.ITestContext context) {

		extent.flush();

	}

}