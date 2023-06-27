package commons;

import javax.swing.JOptionPane;

public class ReadCaptcha{
	private String captcha;
	
	public String readCaptch() {
		
		captcha = JOptionPane.showInputDialog("Please Enter Captcha....");
		return captcha;
	}
}
