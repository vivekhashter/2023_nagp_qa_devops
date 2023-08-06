package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenFunctionalityPage {
	 WebDriver driver;

	public WomenFunctionalityPage(WebDriver driver) {
		this.driver = driver;

	}
	public static By womenbutton = By.xpath("//span[normalize-space()='Women']");
	public static By tops= By.xpath("(//span[text()='Tops'])[2]");
	public static By bottoms= By.xpath("//a[@id='ui-id-10']//span[contains(text(),'Bottoms')]");
	public static By jackets= By.xpath("(//span[text()='Jackets'])[1]");
}

