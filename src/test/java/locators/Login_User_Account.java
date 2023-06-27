package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Login_User_Account {
	WebDriver driver;

	public Login_User_Account() {
		this.driver = Utils.driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "(//*//span//input)[1]")
	public WebElement userName;
	
	
	@FindBy (xpath = "(//*//span//input)[2]")
	public WebElement passWord;
	
	
	@FindBy (xpath = "//div/form//button")
	public WebElement loginButton;
	
	
	@FindBy (xpath = "(//input)[3][@name=\"captchaText\"]")
	public WebElement captchaField;
	
	
	@FindBy (xpath = "//button[text()='Add Widgets']")
	public WebElement addWidgets;
}
