				/* This class contains all the method required for a browser action */

package commons;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WB {
	public static ChromeOptions options;
	public static WebDriver driver = new ChromeDriver(initializeDrver());
	

	public static ChromeOptions initializeDrver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		return options;
	}
	
	
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	
	public static void closeCurrentTab() {	
		driver.close();
	}
	
	
	
	public static void closeAllBrowserTabs() {	
		driver.quit();
	}
	
	public static JavascriptExecutor scrollPage = (JavascriptExecutor)driver;
	
}
