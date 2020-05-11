package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageSteps {

	WebDriver driver;
	
	LoginPage loginPage;
	
	public LoginPageSteps()
	{
		
		loginPage=new LoginPage(HomePageSteps.driver);
		
	}
	
	
	@Then("^user should be able to login sucessfully$")
	public void user_should_be_able_to_login_sucessfully() throws Throwable {
		
		loginPage.VerifyLoginSuccess();	
		HomePageSteps.driver.quit();
		
	}

	
	
	
	
}
