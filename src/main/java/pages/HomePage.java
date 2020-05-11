package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver _driver;

	public HomePage(WebDriver driver)
	{
		this._driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id='login2']")
	WebElement lbl_login;
	

	@FindBy(how=How.XPATH,using="//*[@id='loginusername']")
	WebElement txa_username;
	

	@FindBy(how=How.XPATH,using="//*[@id='loginpassword']")
	WebElement txa_password;
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Log in')]")
	WebElement btn_login;
	
	
	public void navigateToLoginScreen()
	{
		lbl_login.click();
		
	}
	
	public void navigateToBaseUrl()
	{
		_driver.get("https://www.demoblaze.com/");
		
	}
	
	
	public void fillusername(String username)
	{   
		
		new WebDriverWait(_driver, 20).until(ExpectedConditions.elementToBeClickable(txa_username)).click();
		
	    txa_username.click();
	    
		txa_username.clear();
		txa_username.sendKeys(username);
		
	}
	
	public void fillpassword(String password)
	{   txa_password.click();
		txa_password.clear();
		txa_password.sendKeys(password);
		
	}
	
	public void clickLoginButton()
	{
		btn_login.click();
		
	}
	
	
	
	
}



