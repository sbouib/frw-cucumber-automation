package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class Register_CPage {
	
private ConfigFileReader configfilereader;
	
	/*@FindBy*/
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public static WebElement btnRegister;
	
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement userName;
	
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address1;
	
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnEnvoyer;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Note: Your user name is')]")
	public static WebElement Register_CMessage;
	
	public Register_CPage() {
		
		PageFactory.initElements(Setup.driver, this);
		this.configfilereader = new ConfigFileReader();
	}
	
	
	
	/*Methode*/
	public void goToUrl() {
		Setup.getDriver().get(configfilereader.getProperties("home.url"));
	}
	
	public void clickSurBtnRegister() {
		btnRegister.click();
	}
	
	public void fillFirstName(String name ) {
		
		firstName.sendKeys(name);	
	}
	
	public void fillLastName(String lastname) {
		
		lastName.sendKeys(lastname);
	}
	
	public void fillPhone(String num) {
		
		phone.sendKeys(num);
	}
	
	public void fillUserName(String username) {
		
		userName.sendKeys(username);
	}
	
	public void fillAddress(String address) {
		
		address1.sendKeys(address);
	}
	
	public void fillCity(String City) {
		
		city.sendKeys(City);
	}
	
	public void fillState(String State) {
		
		state.sendKeys(State);
	}
	
	public void fillPostalCode(String postalcode) {
		
		postalCode.sendKeys(postalcode);
	}
	
	public void fillCountry(String Country) {
		
		//country.sendKeys(Country);
		Select countryDropDown = new Select(country);
		countryDropDown.selectByVisibleText(Country);
	}
	
	public void fillEmail(String Email) {
		
		email.sendKeys(Email);
	}
	
	public void fillPassword(String Password) {
		
		password.sendKeys(Password);
	}
	
	public void fillConfirmPassword(String ConfirmPassword) {
		
		confirmPassword.sendKeys(ConfirmPassword);
	}
	
	public void clickOnBtnEnvoyer() {
	
		btnEnvoyer.click();
	}

}
