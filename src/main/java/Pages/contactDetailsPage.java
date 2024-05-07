package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;
import Base.BasePage;

public class contactDetailsPage extends BasePage{
	
	public contactDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][1]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//div[2]/input")
	WebElement addresse1;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][1]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][2]//div[2]/input")
	WebElement address2;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][1]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][3]//div[2]/input")
	WebElement city;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][1]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][4]//div[2]/input")
	WebElement State;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][1]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][5]//div[2]/input")
	WebElement postalCode;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][2]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//div[2]/input")
	WebElement Telephone;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][2]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][2]//div[2]/input")
	WebElement Mobile;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][2]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][3]//div[2]/input")
	WebElement Work;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][3]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//div[2]/input")
	WebElement workEmail;
	
	@FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-form-row'][3]/div//div[@class='oxd-grid-item oxd-grid-item--gutters'][2]//div[2]/input")
	WebElement otherEmail;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveBtn;
	
	
	public void set_ContactFeilds(String street1, String street2, String City,String state,String code,String telephone,String mobile,String work,String email1,String email2) throws InterruptedException {
		actions.WaitForElement(addresse1, driver,5000);
		Thread.sleep(2000);
		actions.setText(addresse1, street1, driver);
		actions.setText(address2, street2, driver);
		actions.setText(city, City, driver);
		actions.setText(State, state, driver);
		actions.setText(postalCode, code, driver);
		actions.setText(Telephone, telephone, driver);
		actions.setText(Mobile, mobile, driver);
		actions.setText(Work, work, driver);
		actions.setText(workEmail, email1, driver);
		actions.setText(otherEmail, email2, driver);
		actions.Click(saveBtn, driver);
	}
	
	
}
