package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Task_Report {
	WebDriver driver;
	public Task_Report() {
		this.driver = Utils.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//section//div/a[text()='Task']")
	public WebElement taskReportLink;
	
}
