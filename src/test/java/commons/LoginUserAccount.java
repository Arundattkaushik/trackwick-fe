package commons;

import java.time.Duration;
import javax.swing.JOptionPane;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import locators.*;

public class LoginUserAccount extends Login_User_Account{
	ReadCaptcha captcha = new ReadCaptcha();
	
//	@Test
	public void loginAccount() {
		Utils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Utils.driver.get("http://go.trackwick.com");
		userName.sendKeys("neha@gmail.com");
		passWord.sendKeys("123456");
		loginButton.sendKeys(Keys.ENTER);
		
		try {
			if(addWidgets.isDisplayed()) {
//				JOptionPane.showMessageDialog(Utils.inputBox, "Welcome to Home page...!");
			    
				}
			
		}
		catch(NoSuchElementException e) {
			captchaField.sendKeys(captcha.readCaptch());
			loginButton.sendKeys(Keys.ENTER);
			
			if(addWidgets.isDisplayed()) {
//				JOptionPane.showMessageDialog(Utils.inputBox, "Welcome to Home page...!");
			    
				}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(Utils.inputBox, "Ah Ahh..! This Attempt to login was unsucessful!");
		}
	}
}
