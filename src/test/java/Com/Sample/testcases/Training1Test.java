package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.CreateAccountPage;
import Com.Sample.pages.GearPage;
import Com.Sample.pages.TrainingPage;

public class Training1Test extends basepage {
	CreateAccountPage cp;
	TrainingPage tp;
	String expectedUrl = "https://magento.softwaretestingboard.com/training.html";

	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public Training1Test() {
		super();// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		tp = new TrainingPage(driver);
	}

	@Test(priority = 13)
	public void hoverOverTrainingButton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Training']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);

	}

	@Test(priority = 14)
	public void clickOnVideobutton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Training']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		driver.findElement(TrainingPage.video_download).click();
		Thread.sleep(3000);

	}

	@Test(priority = 15)
	public void clickOntrainingbutton() throws InterruptedException {
		driver.findElement(TrainingPage.training).click();
		cp.waits(TrainingPage.training);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Url's don't match");

	}

}
