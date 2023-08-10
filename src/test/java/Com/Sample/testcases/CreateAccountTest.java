package Com.Sample.testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.CreateAccountPage;
import Com.Sample.pages.WhatNewPage;
import Com.Sample.utilities.PropertiesFile;
import org.junit.Assert; 

public class CreateAccountTest extends basepage {
	CreateAccountPage create = new CreateAccountPage(driver);
	String expectedUrl = "https://magento.softwaretestingboard.com/customer/account/";
	CreateAccountPage ca;
	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public CreateAccountTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		ca = new CreateAccountPage(null);
	}

	@Test(priority = 3)
	public void clickOnCreateAccountButton() throws InterruptedException {
		driver.findElement(CreateAccountPage.create).click();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void accountCreation() throws InterruptedException {
		driver.findElement(CreateAccountPage.create).click();
		create.waits(CreateAccountPage.create);
		driver.findElement(CreateAccountPage.firstname).sendKeys(PropertiesFile.getProperty("FirstName"));
		driver.findElement(CreateAccountPage.lastname).sendKeys("LastName");
		driver.findElement(CreateAccountPage.email).sendKeys(PropertiesFile.getProperty("email"));
		driver.findElement(CreateAccountPage.password).sendKeys("vivek@123");
		driver.findElement(CreateAccountPage.passwordconfirmation).sendKeys("vivek@123");
		driver.findElement(CreateAccountPage.createanaccount).click();
		create.waits(CreateAccountPage.createanaccount);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Url's don't match");

	}

	@Test(priority = 26)
	public void accountCreationFailed() throws InterruptedException {
		driver.findElement(CreateAccountPage.create).click();
		create.waits(CreateAccountPage.create);
		driver.findElement(CreateAccountPage.lastname).sendKeys(PropertiesFile.getProperty("LastName"));
		driver.findElement(CreateAccountPage.email).sendKeys(PropertiesFile.getProperty("email"));
		driver.findElement(CreateAccountPage.password).sendKeys(PropertiesFile.getProperty("password"));
		driver.findElement(CreateAccountPage.passwordconfirmation).sendKeys(PropertiesFile.getProperty("password"));
		driver.findElement(CreateAccountPage.createanaccount);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Url's don't match");

	}

}
