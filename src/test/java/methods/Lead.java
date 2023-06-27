package methods;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import commons.LoginUserAccount;
import commons.TakeSnapShot;
import locators.Lead_;

public class Lead extends Lead_{
	LoginUserAccount login = new LoginUserAccount();

	@Test (priority = 1, groups = {"lead_create"})
	public void leadCreate() {
		
		try {
			login.loginAccount();
			maximizeBrowser();
			driver.navigate().to("https://go.trackwick.com/manager/leads?dynamicTab=kanban");
			newLead.click();
			
			wait.until(ExpectedConditions.visibilityOf(leadName));
			leadName.click();
			leadName.sendKeys("Lead "+Math.round(Math.random()));

			leadSource.click();
			mouseCursor.moveToElement(leadSource_1).click().perform();
			leadType.click();
			mouseCursor.moveToElement(leadType_1).click().perform();
			wait.until(ExpectedConditions.visibilityOf(leadEmail)).sendKeys("test.qa@xyz.com");
			leadPhoneNumber.click();
			leadPhoneNumber.sendKeys("9756412003");
			
			//Scroll page to the bottom
			scrollPage.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			leadWorkflow.click();
			mouseCursor.moveToElement(leadWorkflow_1).click().perform();
			leadOwner.click();
			mouseCursor.moveToElement(leadOwner_1).click().perform();
			leadCreateButton.click();
			TakeSnapShot.fullscreenShot("Passed-Lead Create");
			closeAllBrowserTabs();
			
		}
		catch(ElementNotInteractableException e) {
			e.getRawMessage();
		}	
	}
	
	
	@Test (priority = 2, groups = {"lead", "leadupdate"})
	public void updateLead() {
		
		login.loginAccount();
		maximizeBrowser();
		
		driver.navigate().to("https://go.trackwick.com/manager/leads?dynamicTab=table");
		wait.until(ExpectedConditions.visibilityOf(clickLeadFromList)).click();
		wait.until(ExpectedConditions.visibilityOf(editLeadButton)).click(); 
		
		System.out.println("1");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		System.out.println("page loaded after 30 seconds....");
		System.out.println("2");

		wait.until(ExpectedConditions.elementToBeClickable(editleadType)).sendKeys(Keys.ENTER, Keys.ARROW_DOWN, Keys.ENTER);
		
//		TakeSnapShot.fullscreenShot("Lead_Updated_successfully");
		
	
	}
}
