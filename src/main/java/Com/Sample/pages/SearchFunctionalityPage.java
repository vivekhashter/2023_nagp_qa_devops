package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author viveksharma11
 *
 */
public class SearchFunctionalityPage {
	WebDriver driver;

	public SearchFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static By searchbar= By.xpath("//input[@id='search']");
	public static By searchButton= By.xpath("//button[@title='Search']");
	
}
