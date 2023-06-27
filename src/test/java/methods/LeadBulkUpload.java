package methods;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import commons.LoginUserAccount;
import locators.Lead_Bulk_Upload;

public class LeadBulkUpload extends Lead_Bulk_Upload{
	LoginUserAccount login = new LoginUserAccount();

	@Test
	public void bulkUploadLead() {
		login.loginAccount();
		driver.navigate().to("https://go.trackwick.com/manager/leads?dynamicTab=table");
		maximizeBrowser();
		
		wait.until(ExpectedConditions.visibilityOf(changeToListViewDropdown));
		changeToListViewDropdown.click();
		
		BulkUpload.click();
		
		wait.until(ExpectedConditions.visibilityOf(chooseFileButton));
		chooseFileButton.sendKeys("C:\\Users\\Arun Datt\\Downloads\\Sample Lead.xlsx");
	}
}
