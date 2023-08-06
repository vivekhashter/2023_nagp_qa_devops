package Com.Sample.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Sample.base.basepage;
import Com.Sample.pages.CreateAccountPage;
import Com.Sample.pages.SearchFunctionalityPage;
import Com.Sample.pages.WhatNewPage;
import Com.Sample.utilities.ReadExcelData;

public class SearchFunctionalityTest extends basepage {
	CreateAccountPage cp;
	SearchFunctionalityPage sp;
	private static Logger logger = LogManager.getLogger(WhatNewTest.class);

	public SearchFunctionalityTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		sp = new SearchFunctionalityPage(null);
	}

	@Test(priority = 11)
	public void clickOnSearchbutton() throws Exception {
		Thread.sleep(3000);
		String search = ReadExcelData.readingData(1, 0, false);
		driver.findElement(SearchFunctionalityPage.searchbar).sendKeys(search);
		driver.findElement(SearchFunctionalityPage.searchButton).click();
		Thread.sleep(3000);
	}

	@Test(priority = 12)
	public void incorrectSearch() throws InterruptedException {
		cp.waits(SearchFunctionalityPage.searchbar);
		driver.findElement(SearchFunctionalityPage.searchbar).sendKeys("ggjjtjt");
		driver.findElement(SearchFunctionalityPage.searchButton).click();
		cp.waits(SearchFunctionalityPage.searchButton);
	}
}
