package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Customer_ extends Utils{

	public Customer_() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//section//i)[4]/..")
	WebElement newCustomerCreateButton;
	
	@FindBy (xpath = "(//*[contains(text(), 'Company Name')]//following::div)[3]")
	WebElement customerName;
	
	@FindBy (xpath = "(//*[contains(text(), 'Phone Number')]//following::div)[3]")
	WebElement customerPhone;
	
	@FindBy (xpath = "((//*[text()= 'Email'])[4]//following::div)[3]")
	WebElement customerEmail;
	
	@FindBy (xpath = "((//*[text()= 'Owner'])[4]//following::div)[3]")
	WebElement customerOwner;
	
	@FindBy (xpath = "//button[text()='Create']")
	WebElement customerCreateButton;
	
}
