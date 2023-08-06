package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GearPage {
	WebDriver driver;

	public GearPage(WebDriver driver) {
		this.driver = driver;

	}
	public static By gear= By.xpath("//span[text()='Gear']");
	

	
}
