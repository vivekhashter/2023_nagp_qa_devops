package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.CreateAccountPage;
import Com.Sample.pages.GearPage;
import Com.Sample.pages.MenFunctionalityPage;
import junit.framework.Assert;

public class GearTest extends basepage {
	CreateAccountPage cp = new CreateAccountPage(driver);
	String expectedUrl= "https://magento.softwaretestingboard.com/gear.html";
	GearPage gp;
	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public GearTest() {
		super();// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		gp = new GearPage(null);
	}

	@Test(priority = 5)
	public void hoverOverGearButton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Gear']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);

	}
	@Test(priority = 45)
	public void clickOnGearButton() throws InterruptedException {
		driver.findElement(GearPage.gear).click();
		Thread.sleep(3000);
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl);
	}

}
