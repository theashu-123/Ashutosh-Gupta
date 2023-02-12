package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public  loginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
 
	}
	@FindBy(id = "username")
	WebElement usernameTextField;
	@FindBy(name ="pwd")
	WebElement passwordtextfield;
	@FindBy(xpath =" //div[text()='Login ']")
	WebElement loginButton;
	public void loginaction(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordtextfield.sendKeys(password);
		loginButton.click();
	}
	
	
	

}
