package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Lead_Bulk_Upload extends Utils {
	
	public Lead_Bulk_Upload() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//label[@class=\"ant-radio-button-wrapper\"]")
	public WebElement changeToListView;
	
	
	@FindBy (xpath = "(//div[text()='Lead']/following-sibling::div//div)[3]")
	public WebElement changeToListViewDropdown;
	
	
	@FindBy (xpath = "//ul//li[text()='Bulk Upload']")
	public WebElement BulkUpload;
	
	
	@FindBy (xpath = "(//div[@class=\"timeline-container_1w0TR\"]//span)[6]//button")
	public WebElement chooseFileButton;
	
	
	@FindBy (xpath = "")
	public WebElement chooseLeadFile;
}
