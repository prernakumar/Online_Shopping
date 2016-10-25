package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
	
	
	
	@FindBy(xpath=".//*[@id='nav-link-yourAccount']/span[2]")
	WebElement Account;
	
	//@FindBy(className="nav-action-inner")
	@FindBy(linkText="Sign in")
	public
	WebElement SignIn;
	
	@FindBy(name="email")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement Submit;
	
	public LoginPage(WebDriver driver)
	{
	super(driver);
	}
	
	public WebElement Account()
	{
		return Account;
	}
	
	public WebElement SignIn()
	{
		return SignIn;
	}
	
	public WebElement Username()
	{
		return Username;
	}
	
	public WebElement Password()
	{
		return Password;
	}
	
	public WebElement Submit()
	{
		return Submit;
	}
	

}
