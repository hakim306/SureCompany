package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;
import Base.BasePage;

public class personaldataPage extends BasePage{
	
	public personaldataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Contact Details')]")
	WebElement contactDetails;
	
	public void click_contactDetails() {
		actions.WaitForElement(contactDetails, driver,4000);
		actions.Click(contactDetails, driver);
	}

}
