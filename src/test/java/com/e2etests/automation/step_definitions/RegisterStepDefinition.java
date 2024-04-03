package com.e2etests.automation.step_definitions;






import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	private RegisterPage registerPage;
	public RegisterStepDefinition() {
	 this.registerPage = new RegisterPage();
	}

	@Given("je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		registerPage.goToUrl();
	}

	@Given("je me crick sur Register")
	public void jeMeCrickSurRegister() {
		registerPage.clickSurBtnRegister();

	}

	@When("je saisie mon First Name {string}")
	public void jeSaisieMonFirstName(String name) {
	    
		registerPage.fillFirstName(name);

	}

	@When("Je saisie mon Last Name {string}")
	public void jeSaisieMonLastName(String lastname) {
		registerPage.fillLastName(lastname);

	}

	@When("je saisie mon numero telephone {string}")
	public void jeSaisieMonNumeroTelephone(String num) {
		registerPage.fillPhone(num);

	}

	@When("je saisie mon address Email {string}")
	public void jeSaisieMonAddressEmail(String username) {
		registerPage.fillEmail(username);

	}

	@When("je saisie mon Address {string}")
	public void jeSaisieMonAddress(String address) {
		registerPage.fillAddress(address);
		
	}

	@When("je saisie ma ville {string}")
	public void jeSaisieMaVille(String City) {
		registerPage.fillCity(City);

	}

	@When("je saisie mon stat {string}")
	public void jeSaisieMonStat(String State) {
	   
		registerPage.fillState(State);

	}

	@When("je saisie mon code postal {string}")
	public void jeSaisieMonCodePostal(String postalcode) {
		registerPage.fillPostalCode(postalcode);

	}
	
	@When("je selectionne le pays {string}")
	public void jeSelectionneLePays(String Country) {
		registerPage.fillCountry(Country);
	}




	@When("je saisie mon User Name {string}")
	public void jeSaisieMonUserName(String Email) {
		registerPage.fillUserName(Email);
	}

	@When("je saisie mon Password {string}")
	public void jeSaisieMonPassword(String Password) {
		registerPage.fillPassword(Password);

	}

	@When("je confirm mon Password {string}")
	public void jeConfirmMonPassword(String ConfirmPassword) {
		registerPage.fillConfirmPassword(ConfirmPassword);

	}

	@When("je click sur le boutton Envoyer")
	public void jeClickSurLeBouttonEnvoyer() {
		registerPage.clickOnBtnEnvoyer();

	}

	
	@Then("je me derige vers la page register success {string}")
	public void jeMeDerigeVersLaPageRegisterSuccess(String text) {
		String message = registerPage.RegisterMessage.getText();
		Assert.assertEquals(message, text);
		
	}




}
