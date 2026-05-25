package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import listeners.ExtentReportTestListener;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;

@Listeners(ExtentReportTestListener.class)

public class LoginTest extends BaseTest {

	LoginPage loginPage;

	HomePage homePage;

	@BeforeMethod

	public void start() {

		setup();

		loginPage = new LoginPage(driver);
	}

	@Test

	public void verifyLogin() {

		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));

		homePage = new HomePage(driver);

		Assert.assertTrue(homePage.isDashboardVisible());

	}

	@AfterMethod

	public void end() {

		tearDown();
	}

}