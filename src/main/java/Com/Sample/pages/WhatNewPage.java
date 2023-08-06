package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class WhatNewPage {

	WebDriver driver;

	public WhatNewPage(WebDriver driver) {
		this.driver = driver;
	}
	public static By whatnew_button = By.xpath("(//a[@class='level-top ui-corner-all']//span)[1]");
	public static By yoga_button= By.xpath("//span[@class='more button']");
	public static By firstimage= By.xpath("//img[@alt='Echo Fit Compression Short']");
	public static By homebutton= By.xpath("//a[@title='Go to Home Page']");
	public static By size=By.xpath("//div[@id='option-label-size-143-item-171']");
	public static By color=By.xpath("//div[@id='option-label-color-93-item-49']");
	public static By addtocart= By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]");	
    
}
