package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage  {
	WebDriver driver;
	public SigninPage(WebDriver driver) {
        this.driver = driver;
    }
	
	
	public static By signinbutton = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	public static By email = By.xpath("//input[@id='email']");
	public static By password = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
	public static By finalsignin = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
	public static By arrowbutton = By.xpath("//button[1]");
	public static By assertion = By.xpath("(//span[@class='not-logged-in'])[1]");
    public static By signoutbutton = By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']");
}