package testCases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Base.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PIMPage;
import Pages.contactDetailsPage;
import Pages.personaldataPage;

public class Login extends BasePage {
	
	Faker faker=new Faker();
	String street=faker.address().streetAddress();
	
	@Test(dataProviderClass=JsonReader.class,dataProvider = "dp")
	public void Login(HashMap<String, String> hashMap) throws InterruptedException {
		LoginPage loginPage=new LoginPage();
		loginPage.userLogin("Admin","admin123");
		Thread.sleep(3000);
		HomePage homePage=new HomePage();
		homePage.clickPIM();
		PIMPage pimPage=new PIMPage();
		pimPage.click_firstRecord();
		personaldataPage personaldataPage=new personaldataPage();
		personaldataPage.click_contactDetails();
		contactDetailsPage contactDetailsPage=new contactDetailsPage();
		contactDetailsPage.set_ContactFeilds(street, street,hashMap.get("city"),hashMap.get("state"),hashMap.get("postalCode"),hashMap.get("home"),hashMap.get("mobile"),hashMap.get("work"),hashMap.get("workEmail"),hashMap.get("email"));
		
	}

}