package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;
import Base.BasePage;

public class PIMPage extends BasePage {
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	//div[@class='oxd-table-filter-area']//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//input
	@FindBy(xpath= "//div[@class='oxd-table-card'][1]//div[9]//button[2]")
	WebElement firstRecord;
	
	@FindBy(xpath = "//div[@class='oxd-table-body']//div[1]//div[3]")
	WebElement firstRecordName;
	
	//div.oxd-form-row>div>div>div>div>div
	public String Get_firstID() {
		actions.WaitForElement(firstRecordName, driver,3000);
		String firstid=driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[1]//div[3]")).getText();
		return firstid;
	}
	public void click_firstRecord() {
		actions.WaitForElement(firstRecord, driver,3000);
		actions.Click(firstRecord, driver);
		
	}

}
