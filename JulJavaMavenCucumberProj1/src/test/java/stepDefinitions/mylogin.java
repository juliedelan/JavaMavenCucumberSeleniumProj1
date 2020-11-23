package stepDefinitions;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageSet.*;
//import pageSet.loginPage;


public class mylogin {
	
	WebDriver driver = null;
	loginPage ln_Pg;
	homePage hm_Pg;
	

	@Before
	public void browserSetup(){
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20000,TimeUnit.SECONDS);
	}	//end browser setup
	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}// end teardown
	
	
	@Given("user in login page")
	public void user_in_login_page() {
		driver.get("https://example.testproject.io/web");
		ln_Pg= new loginPage(driver);
		
	}

	

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		ln_Pg.enter_UserName(username);
		ln_Pg.enter_Password(password);
	   
	}

	
	@Then("click on login")
	public void click_on_login() {
		ln_Pg.click_Login();
	    
	}

	
	@Then("user landed on home page")
	public void user_landed_on_home_page() {
		System.out.println(" I am on the home page");
	}

	@When("user click on logout")
	public void user_click_on_logout() {
		hm_Pg= new homePage(driver);
	}

	

	@Then("user logged out")
	public void user_logged_out() {
		hm_Pg.logout_from_homepage();
	}

	

	
	
	
	
	
	
	
	
	
	
	
}
