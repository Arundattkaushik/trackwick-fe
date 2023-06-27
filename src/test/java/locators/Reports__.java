package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Reports__ extends Utils {
	
	public Reports__() {
		PageFactory.initElements(Utils.driver, this);
	}
	
	@FindBy(xpath = "(//button)[4]")
	public WebElement reportFilter;
	
	@FindBy (xpath = "(//label[text()='Date Type']/..//following-sibling::div//span//div)[4]")
	public WebElement dateType;
	
	@FindBy (xpath = "//ul//li[text()='Last 30 Days']")
	public WebElement last30Days;
	
	//============= Lead Fields in Reports filter
	@FindBy (xpath = "(//label[text()='Lead Fields (Optional)']/../following-sibling::div//span)[1]")
	public WebElement lf_;
	
	@FindBy (xpath = "//div[text()='Lead ID']/..")
	public WebElement lf_0;
}
