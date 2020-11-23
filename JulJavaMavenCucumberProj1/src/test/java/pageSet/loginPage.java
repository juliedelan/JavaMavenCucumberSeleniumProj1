package pageSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver1= null;
	
	@FindBy(id="name")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement PassWord;
	
	@FindBy(id="login")
	WebElement login_btn;
	
	public loginPage(WebDriver driver) {
		
		driver1=driver;
		PageFactory.initElements(driver1, this);
	}// end constructor
	
	
	public void enter_UserName(String username) {
		UserName.sendKeys(username);
	}
	
	public void enter_Password(String password) {
		PassWord.sendKeys(password);
	}
	
	
	public void click_Login() {
		login_btn.click();
	}
	
	
	

}//end loginPage class
