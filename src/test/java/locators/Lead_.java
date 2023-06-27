package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Lead_ extends Utils {

	public Lead_() {
		PageFactory.initElements(driver, this);
	}
	
	//Lead Create Locators
	
	@FindBy (xpath = "//div[@class=\"add-role_3RmVu\"]")
	public WebElement newLead;
	
	@FindBy (xpath = "//label[text()='Lead Name']/following-sibling::div//input")
	public WebElement leadName;
	
	
	@FindBy (xpath = "(//label[text()='Lead Source']/following-sibling::div//div)[6]")
	public WebElement leadSource;
	
	@FindBy (xpath = "//span//div//ul//li[text()='Instagram']")
	public WebElement leadSource_1;
	
	
	@FindBy (xpath = "(//label[text()='Type']/following-sibling::div//div)[6]")
	public WebElement leadType;
	
	
	@FindBy (xpath = "//span//div//ul//li[text()='COLD']")
	public WebElement leadType_1;
	
	
	@FindBy (xpath = "//span/input[@placeholder='Please enter email']")
	public WebElement leadEmail;
	
	
	@FindBy (xpath = "(//label[text()='Phone Number']/following-sibling::div//div)[2]//input")
	public WebElement leadPhoneNumber;
	
	
	@FindBy (xpath = "(//label[text()='Workflow']/../following-sibling::div//div)[6]")
	public WebElement leadWorkflow;
	
	
	@FindBy (xpath = "//span//ul//li[text()='Lead WorkFlow']")
	public WebElement leadWorkflow_1;
	
	
	@FindBy (xpath = "//div[text()='Select Owner']")
	public WebElement leadOwner;
	
	
	@FindBy (xpath = "//div//ul//li[text()='Arun Datt Kaushik']")
	public WebElement leadOwner_1;
	
	
	@FindBy (xpath = "(//form//div//button)[5]")
	public WebElement leadCreateButton;
	
	
	//Lead Update Locators
	
	@FindBy (xpath = "(//tbody//tr//td)[2]//span")
	public WebElement clickLeadFromList;
	
	
	@FindBy (xpath = "//span[text()='Edit']/../..")
	public WebElement editLeadButton;
	
	
	@FindBy (xpath = "//span//input[@name=\"name\"]")
	public WebElement editLeadName;
	
	
	@FindBy (xpath = "(//label[text()='Type']/following::div/div)")
	public WebElement editleadType;
	
	
	@FindBy (xpath = "(//span//input)[6]")
	public WebElement editLeadPhone;
	
	
	@FindBy (xpath = "(//div//button)[10]")
	public WebElement updateLead;
}
