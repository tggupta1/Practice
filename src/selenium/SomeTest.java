package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SomeTest {
	
	static WebDriver driver;
	
	@BeforeTest
	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32_5\\chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	 @Factory
	    public static Object[] createInstances() {
	        Object[] result = new Object[]{            
	            new SomeTest(driver)
	            // you can add other drivers here
	        };
	        return result;
	    }
	    //private final WebDriver driver;

	    public SomeTest(WebDriver driver) {
	        this.driver = driver;
	    }

	    @DataProvider(name = "URLs")
	    public Object[][] createData1() {
	     return new Object[][] {
	       {"url 1"},
	       {"url 2"},
	       {"url 3"}};
	    }    

	    @AfterClass
	    public void closeWebDriver(){
	        driver.quit();
	    }   
	    //test methods below
	    @Test(dataProvider = "URLs")
	    public void test1(String url){
	        System.out.println("This is Test1");
	    }

	    @Test(dataProvider = "URLs")
	    public void test2(String url){
	    	System.out.println("This is Test2");
	    }

	    @Test(dataProvider = "URLs")
	    public void test3(String url){
	    	System.out.println("This is Test3");
	    }

	    @Test(dataProvider = "URLs")
	    public void test4(String url){
	    	System.out.println("This is Test4");
	    }
}
