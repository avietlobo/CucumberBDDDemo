package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class HomePageSteps {

	public static WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	
	
	public HomePageSteps()
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		driver=new ChromeDriver();
		homePage=new HomePage(driver);
		
		
	}

	
	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	   
		
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		homePage=new HomePage(driver);
		homePage.navigateToBaseUrl();
		
			
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	   
		homePage.navigateToLoginScreen();
		
	}

	@When("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String username, String psswd) throws Throwable {
		homePage.fillusername(username);
		homePage.fillpassword(psswd);
		homePage.clickLoginButton();
		
	}

	

	
	
	
	
}
