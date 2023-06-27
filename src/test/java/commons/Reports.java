package commons;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.Reports__;

public class Reports extends Reports__ {
	
	public void taskReport() {
		Utils.driver.navigate().to("https://go.trackwick.com/manager/report/template/TASK");
	}
	

	public void reportFilterButton() {
	
		reportFilter.click();
	}
	
	public void dateTypeSelector() {
		Utils.wait.until(ExpectedConditions.visibilityOf(dateType));
		dateType.click();
		Utils.mouseCursor.moveToElement(last30Days).click().perform();
	}
	
	
	public void leadFileds() {
		Utils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		lf_.click();
	}
}
