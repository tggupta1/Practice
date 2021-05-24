package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InitiateDriver {
	WebDriver driver;
	
	public WebDriver initiateChromeDriver(String URL){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tarun\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		return driver;
	}

	public WebDriver initiateChromeDriver2(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tarun\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://fb.com");
		return driver;
	}
	
	public static void main(String...strings ){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tarun\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/V4/");
	    
	    //Second session of WebDriver
	    WebDriver driver2 = new ChromeDriver();
	    driver2.get("http://www.google.com");
	}
}
