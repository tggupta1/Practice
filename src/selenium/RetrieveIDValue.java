package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class RetrieveIDValue extends InitiateDriver {
	WebDriver driver = null;
	String URL = "https://fastaglogin.icicibank.com/CUSTLOGIN/Pages/CustomerService/CustomerAccountSummary.aspx";

	@FindBy(xpath = "//*[@id]")
	WebElement idVal;

	@Test
	public void launchChromeBrowser() throws InterruptedException {
		this.driver = initiateChromeDriver(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		List<WebElement> vals = driver.findElements(By.xpath("//*[@id]"));
		System.out.println(vals.size());
		for(WebElement e1: vals) {
			System.out.println(e1.getAttribute("id"));
		}
		

		
		driver.close();

	}
}
