package pageSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	WebDriver driver1=null;
	
	public homePage(WebDriver driver) {
		driver1=driver;
		PageFactory.initElements(driver1, this);
	}
	
	
	@FindBy(id="logout")
	WebElement logout_btn;
	
	public void logout_from_homepage() {
		logout_btn.click();
		
	}
	
	

}//end homePage class
