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
import Com.Sample.pages.WhatNewPage;
import Com.Sample.pages.WomenFunctionalityPage;

public class WomenTest extends basepage {
	CreateAccountPage cp;
	String expectedUrl="https://magento.softwaretestingboard.com/women/bottoms-women.html";
	WomenFunctionalityPage wp;
	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public WomenTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		wp = new WomenFunctionalityPage(null);
	}

	@Test(priority = 22)
	public void hoverOverWomenButton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);

	}

	@Test(priority = 23)
	public void clickOnTopsButtonNegative() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		driver.findElement(WomenFunctionalityPage.tops).click();
		Thread.sleep(3000);

	}

	@Test(priority = 24)
	public void clickOnJacketsButton() throws InterruptedException {
		String e= "https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html";
		WebElement y = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		WebElement tops = driver.findElement(By.xpath("(//span[text()='Tops'])[1]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(y).perform();
		Thread.sleep(3000);
		act.moveToElement(tops).perform();
		driver.findElement(WomenFunctionalityPage.jackets);
		cp.waits(WomenFunctionalityPage.jackets);
		String a = driver.getCurrentUrl();
		Assert.assertEquals(e,a);
		

	}

	@Test(priority = 25)
	public void clickOnBottomButton() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		Thread.sleep(3000);
		driver.findElement(WomenFunctionalityPage.bottoms).click();
		cp.waits(WomenFunctionalityPage.bottoms);
		String actualUrl= driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

	}

}
