package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	WebDriver _driver;
	
	public LoginPage(WebDriver driver)
	{
		this._driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='nameofuser']")
	WebElement lbl_welcome;
	
	
	public void VerifyLoginSuccess()
	{
		new WebDriverWait(_driver, 20).until(ExpectedConditions.textToBePresentInElement(lbl_welcome, "Welcome"));

		Assert.assertTrue(lbl_welcome.getText().contains("Welcome"));
	}
	
	
	
	
}
