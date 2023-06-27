package commons;

import java.time.Duration;

import javax.swing.JFrame;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.interactions.Actions;

public class Utils extends WB {
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public static FluentWait fwait = new FluentWait(driver)
										.withTimeout(Duration.ofSeconds(30))
										.pollingEvery(Duration.ofMillis(1))
										.ignoring(ElementNotInteractableException.class);
	
	public static Actions mouseCursor = new Actions(driver);
	public static JFrame inputBox = new JFrame();
}
