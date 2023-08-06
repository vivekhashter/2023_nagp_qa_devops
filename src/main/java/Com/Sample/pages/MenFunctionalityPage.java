package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenFunctionalityPage {
	WebDriver driver;

	public MenFunctionalityPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public static By menbutton = By.xpath("//span[normalize-space()='Men']");
	public static By tops = By.xpath("//a[@id='ui-id-17']//span[contains(text(),'Tops')]");
	public static By bottoms = By.xpath("//a[@id='ui-id-10']//span[contains(text(),'Bottoms')]");
    public static By jackets= By.xpath("(//span[text()='Jackets'])[2]");
}
