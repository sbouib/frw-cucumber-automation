package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.Register_CPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_CStepDefinition {
	
	private Register_CPage register_CPage;
	public Register_CStepDefinition() {
	 this.register_CPage = new Register_CPage();
	}

	@Given("je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		register_CPage.goToUrl();
	}

	@Given("je me crick sur Register")
	public void jeMeCrickSurRegister() {
		register_CPage.clickSurBtnRegister();

	}

	@When("je saisie mon First Name {string}")
	public void jeSaisieMonFirstName(String name) {
	    
		register_CPage.fillFirstName(name);

	}

	@When("Je saisie mon Last Name {string}")
	public void jeSaisieMonLastName(String lastname) {
		register_CPage.fillLastName(lastname);

	}

	@When("je saisie mon numero telephone {string}")
	public void jeSaisieMonNumeroTelephone(String num) {
		register_CPage.fillPhone(num);

	}

	@When("je saisie mon address Email {string}")
	public void jeSaisieMonAddressEmail(String username) {
		register_CPage.fillEmail(username);

	}

	@When("je saisie mon Address {string}")
	public void jeSaisieMonAddress(String address) {
		register_CPage.fillAddress(address);
		
	}

	@When("je saisie ma ville {string}")
	public void jeSaisieMaVille(String City) {
		register_CPage.fillCity(City);

	}

	@When("je saisie mon stat {string}")
	public void jeSaisieMonStat(String State) {
	   
		register_CPage.fillState(State);

	}

	@When("je saisie mon code postal {string}")
	public void jeSaisieMonCodePostal(String postalcode) {
		register_CPage.fillPostalCode(postalcode);

	}

	@When("je select le pays {string}")
	public void jeSelectLePays(String Country) {
		register_CPage.fillCountry(Country);
	}




	@When("je saisie mon User Name {string}")
	public void jeSaisieMonUserName(String Email) {
		register_CPage.fillUserName(Email);
	}

	@When("je saisie mon Password {string}")
	public void jeSaisieMonPassword(String Password) {
		register_CPage.fillPassword(Password);

	}

	@When("je confirm mon Password {string}")
	public void jeConfirmMonPassword(String ConfirmPassword) {
		register_CPage.fillConfirmPassword(ConfirmPassword);

	}

	@When("je click sur le boutton Envoyer")
	public void jeClickSurLeBouttonEnvoyer() {
		register_CPage.clickOnBtnEnvoyer();

	}

	
	@Then("je me derige vers la page register success {string}")
	public void jeMeDerigeVersLaPageRegisterSuccess(String text) {
		String message = register_CPage.Register_CMessage.getText();
		Assert.assertEquals(message, text);
		
	}



}
