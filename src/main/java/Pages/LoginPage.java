package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class LoginPage extends actions{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	public void userLogin(String username, String password) {
		actions.setText(userName, username,driver);
		actions.setText(Password, password,driver);
		actions.Click(loginBtn, driver);
	}

}
