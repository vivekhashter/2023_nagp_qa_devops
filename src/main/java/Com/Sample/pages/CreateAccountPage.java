package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {
	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public static By create = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
	public static By firstname = By.xpath("//input[@id='firstname']");
	public static By lastname = By.xpath("//input[@id='lastname']");
	public static By email = By.xpath("//input[@id='email_address']");
	public static By password = By.xpath("//input[@id='password']");
	public static By passwordconfirmation = By.xpath("//input[@id='password-confirmation']");
	public static By createanaccount = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");

   public  void waits(By by) {
	   WebDriverWait wait= new WebDriverWait(driver, 4);
	   wait.until(ExpectedConditions.presenceOfElementLocated(by));
   }

}

