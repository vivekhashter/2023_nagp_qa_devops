package Com.Sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrainingPage {
	WebDriver driver;

	public TrainingPage(WebDriver driver) {
		this.driver = driver;
	}

	// span[text()='Video Download']
	public static By training = By.xpath("//span[text()='Training']");
	public static By video_download = By.xpath("//span[text()='Video Download']");

}
