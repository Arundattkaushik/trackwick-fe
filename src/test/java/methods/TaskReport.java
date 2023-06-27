package methods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.LoginUserAccount;
import commons.Reports;
import commons.TakeSnapShot;
import commons.Utils;
import locators.Task_Report;

public class TaskReport extends Task_Report{
	LoginUserAccount login = new LoginUserAccount();
	Reports rp = new Reports();
	
	
	
	@BeforeClass 
	public void login_User() {
		login.loginAccount();
		Utils.maximizeBrowser();
	}
	
	
	@Test
	public void clickTaskReport() throws InterruptedException {
		rp.taskReport();
		rp.reportFilterButton();
		rp.dateTypeSelector();
		rp.leadFileds();
		TakeSnapShot.fullscreenShot("Task Report");
		
	}
	
	
	
	@AfterClass
	public void close_Browser() {
		Utils.closeAllBrowserTabs();
	}

}
