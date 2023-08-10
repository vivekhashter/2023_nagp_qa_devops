package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.CreateAccountPage;
import Com.Sample.pages.SearchFunctionalityPage;
import Com.Sample.pages.SigninPage;
import Com.Sample.utilities.ReadExcelData;
import org.junit.Assert; 

public class SigninTest extends basepage {
	CreateAccountPage cp = new CreateAccountPage(driver);
	SigninPage sp;
	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public SigninTest() {
		super();// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		sp = new SigninPage(null);
	}

	@Test(priority = 1)
	public void clickOnSigninbutton() throws InterruptedException {
		driver.findElement(SigninPage.signinbutton).click();
	}

	@Test(priority = 2)
	public void signInToLumaPortal() throws Exception {
		String Email = ReadExcelData.readingData(1, 0, true);
		String Password = ReadExcelData.readingData(1, 1, true);
		driver.findElement(SigninPage.signinbutton).click();
		driver.findElement(SigninPage.email).sendKeys(Email);
		Thread.sleep(3000);
		driver.findElement(SigninPage.password).sendKeys(Password);
		Thread.sleep(3000);
		driver.findElement(SigninPage.finalsignin).click();
		Thread.sleep(3000);
		driver.findElement(SigninPage.arrowbutton).click();
		Thread.sleep(3000);
		driver.findElement(SigninPage.signoutbutton).click();
		Thread.sleep(5000);
		boolean result = false;
		if (driver.findElements(SigninPage.assertion).size() > 0) {
			result = true;
		}
		Assert.assertTrue(result);
		

	}
	@Test
	public void signInToLumaPortalFailed() throws Exception {
		String Email = ReadExcelData.readingData(1, 0, true);
		String Password = ReadExcelData.readingData(1, 1, true);
		driver.findElement(SigninPage.signinbutton).click();
		driver.findElement(SigninPage.email).sendKeys(Email);
		cp.waits(SigninPage.email);
		driver.findElement(SigninPage.password).sendKeys(Password);
		cp.waits(SigninPage.password);
		driver.findElement(SigninPage.finalsignin).click();
		cp.waits(SigninPage.finalsignin);
		driver.findElement(SigninPage.arrowbutton).click();
		cp.waits(SigninPage.arrowbutton);
		driver.findElement(SigninPage.signoutbutton);
		cp.waits(SigninPage.signinbutton);
		boolean result = false;
		if (driver.findElements(SigninPage.assertion).size() > 0) {
			result = true;
		}
		Assert.assertTrue(result);
	

	}

}
