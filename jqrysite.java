package drag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;


public class jqrysite 
{	
	//static WebDriver ChDriver;
	public static WebDriver Driver;
	static JavascriptExecutor mzexecutor;
	
	public static String DriverPathCH = "C:\\Users\\rohan\\workspace\\chromedriver\\chromedriver.exe";
	public static String DriverPathIE = "C:\\Users\\rohan\\workspace\\chromedriver\\IEDriverServer.exe";
	
	public static String baseUrl = "https://jqueryui.com/sortable/";

	
	public static void main(String args[]) throws InterruptedException 
	{		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rohan\\workspace\\chromedriver\\geckodriver.exe"); 
								
		FirefoxOptions options = new FirefoxOptions();
		
		Driver = new FirefoxDriver(options);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get(baseUrl);
		
		Thread.sleep(5000);
		
		Actions action = new Actions(Driver);
		
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Driver.switchTo().frame(0);
		
		WebElement drage = Driver.findElement(By.xpath("//*[@id='sortable']/li[1]/span"));
		//WebElement drop = Driver.findElement(By.id("droppable"));
		
		action.clickAndHold(drage).moveByOffset(0, 200).release().build().perform();
		
        Thread.sleep(5000);
        
        Driver.quit();
	}
			
}