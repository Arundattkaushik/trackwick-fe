package commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeSnapShot extends Utils{

	public static void fullscreenShot(String title) {
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			System.out.println("Before: Files Utils");
			FileUtils.copyFile(screenShot, new File("C:\\Users\\Arun Datt\\eclipse-workspace\\trackwick-fe\\screenShots\\"+title+".png"));
			System.out.println("After: Files Utils");
		} 
		catch (IOException e) {
			
			System.out.println("Ahh..Ah! Failed to create screenshot file....!");
		}
	}
}
