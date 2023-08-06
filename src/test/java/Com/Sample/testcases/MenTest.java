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
import Com.Sample.pages.MenFunctionalityPage;
import Com.Sample.pages.WomenFunctionalityPage;

public class MenTest extends basepage {
	CreateAccountPage cp;
	MenFunctionalityPage mp;
	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public MenTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		mp = new MenFunctionalityPage(null);
	}

	@Test(priority = 7)
	public void hoverOverWomenButton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);

	}

	@Test(priority = 8)
	public void clickOnTopsButton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Men']"));
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		driver.findElement(MenFunctionalityPage.tops).click();
		Thread.sleep(3000);

	}

	@Test(priority = 9)
	public void clickOnJacketsButton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Men']"));
		WebElement tops = driver.findElement(By.xpath("(//span[text()='Tops'])[2]"));
		WebElement jacket = driver.findElement(By.xpath("(//span[text()='Jackets'])[2]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		act.moveToElement(tops).perform();
		Thread.sleep(3000);
		act.moveToElement(jacket).perform();
		Thread.sleep(3000);
		driver.findElement(MenFunctionalityPage.jackets).click();

	}

	@Test(priority = 10)
	public void clickOnBottomButton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Men']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		driver.findElement(MenFunctionalityPage.bottoms).click();
		cp.waits(MenFunctionalityPage.bottoms);
		

	}

}
