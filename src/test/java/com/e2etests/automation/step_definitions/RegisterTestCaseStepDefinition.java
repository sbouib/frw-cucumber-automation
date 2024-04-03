package com.e2etests.automation.step_definitions;

import org.junit.Assert;


import com.e2etests.automation.page_objects.RegisterTestCasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTestCaseStepDefinition {
	
	private RegisterTestCasePage registerTestCasePage;
	
	public RegisterTestCaseStepDefinition() {
	 this.registerTestCasePage = new RegisterTestCasePage();
	}

	 @Given("Je me connecte sur l application Mercury")
	 public void jeMeConnecteSurLApplicationMercury() {
		 registerTestCasePage.goToUrl(); 
	 }
	 @When("Je click sur le lien Register")
	 public void jeClickSurLeLienRegister() {
		 registerTestCasePage.clickSurBtnRegister();
	}
	@When("Je saisie mon First Name {string}")
	public void jeSaisieMonFirstName(String name) {
		registerTestCasePage.fillFirstName(name);
	   
	}
	@When("je saisie mon Last Name {string}")
	public void jeSaisieMonLastName(String lastname) {
		registerTestCasePage.fillLastName(lastname);
	  
	}
	@When("Je saisie mon numero telephone {string}")
	public void jeSaisieMonNumeroTelephone(String num) {
		registerTestCasePage.fillPhone(num);
	   
	}
	@When("Je saisie mon address Email {string}")
	public void jeSaisieMonAddressEmail(String Email) {
		registerTestCasePage.fillEmail(Email);
	}
	@When("Je saisie mon Address {string}")
	public void jeSaisieMonAddress(String address) {
		registerTestCasePage.fillAddress(address);
	}
	@When("Je saisie ma ville {string}")
	public void jeSaisieMaVille(String City) {
		registerTestCasePage.fillCity(City);
	    
	}
	@When("Je saisie mon stat {string}")
	public void jeSaisieMonStat(String State) {
		registerTestCasePage.fillState(State);
	   
	}
	@When("Je saisie mon code postal {string}")
	public void jeSaisieMonCodePostal(String postalcode) {
		registerTestCasePage.fillPostalCode(postalcode);
	   
	}
	@When("Je selectionne le pays {string}")
	public void jeSelectionneLePays(String Country) {
		registerTestCasePage.fillCountry(Country);
		
	   
	}
	@When("Je saisie mon User Name {string}")
	public void jeSaisieMonUserName(String Email) {
		registerTestCasePage.fillUserName(Email);
	   
	}
	@When("Je saisie mon Password {string}")
	public void jeSaisieMonPassword(String Password) {
		registerTestCasePage.fillPassword(Password);
	    
	}
	@When("Je confirm mon Password {string}")
	public void jeConfirmMonPassword(String ConfirmPassword) {
		registerTestCasePage.fillConfirmPassword(ConfirmPassword);
	   
	}
	@When("Je click sur le boutton Envoyer")
	public void jeClickSurLeBouttonEnvoyer() {
		registerTestCasePage.clickOnBtnEnvoyer();
	   
	}
	@Then("Je me derige vers la page register success {string}")
	public void jeMeDerigeVersLaPageRegisterSuccess(String text) {
		String message = registerTestCasePage.RegisterMessage.getText();
		Assert.assertEquals(message, text);
	
	}


	}


