package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.WhatNewPage;
import Com.Sample.pages.CreateAccountPage;
import Com.Sample.pages.SigninPage;
import Com.Sample.utilities.PropertiesFile;

public class WhatNewTest extends basepage {
    CreateAccountPage cp;
	WhatNewPage wp;
	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public WhatNewTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		wp = new WhatNewPage(null);
	}

	@Test(priority = 16)
	public void clickOnWhatNewButton() throws InterruptedException {
		cp.waits(WhatNewPage.whatnew_button);
		driver.findElement(WhatNewPage.whatnew_button).click();
		Thread.sleep(5000);
	}

	@Test(priority = 17)
	public void clickOnYogaButton() throws InterruptedException {
		cp.waits(WhatNewPage.whatnew_button);
		driver.findElement(WhatNewPage.whatnew_button).click();
		cp.waits(WhatNewPage.whatnew_button);
		driver.findElement(WhatNewPage.yoga_button).click();
	}

	@Test(priority = 18)
	public void clickOnFirstImage() throws InterruptedException {
		cp.waits(WhatNewPage.whatnew_button);
		driver.findElement(WhatNewPage.whatnew_button).click();
		cp.waits(WhatNewPage.whatnew_button);
		driver.findElement(WhatNewPage.yoga_button).click();
		driver.findElement(WhatNewPage.firstimage).click();
	}

	@Test(priority = 19)
	public void goBackToHome() throws InterruptedException {
		cp.waits(WhatNewPage.whatnew_button);
		driver.findElement(WhatNewPage.whatnew_button).click();
		driver.findElement(WhatNewPage.yoga_button).click();
		driver.findElement(WhatNewPage.firstimage).click();
		cp.waits(WhatNewPage.firstimage);
		driver.findElement(WhatNewPage.homebutton).click();
		cp.waits(WhatNewPage.homebutton);
	}

	@Test(priority = 20)
	public void AddtoCartPositive() throws InterruptedException {
		cp.waits(WhatNewPage.whatnew_button);
		driver.findElement(WhatNewPage.whatnew_button).click();
		driver.findElement(WhatNewPage.yoga_button).click();
		driver.findElement(WhatNewPage.firstimage).click();
		cp.waits(WhatNewPage.firstimage);
		driver.findElement(WhatNewPage.size).click();
		Thread.sleep(3000);
		driver.findElement(WhatNewPage.color).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10)");
		driver.findElement(WhatNewPage.addtocart).click();
	}

	@Test(priority = 21)
	public void AddtoCartNegative() throws InterruptedException {
		driver.findElement(WhatNewPage.whatnew_button).click();
		driver.findElement(WhatNewPage.yoga_button).click();
		driver.findElement(WhatNewPage.firstimage).click();
		cp.waits(WhatNewPage.firstimage);
		driver.findElement(WhatNewPage.addtocart).click();

	}
}
