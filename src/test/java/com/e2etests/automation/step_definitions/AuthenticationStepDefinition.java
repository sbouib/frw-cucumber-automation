package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationpage;

	public AuthenticationStepDefinition() {
		this.authenticationpage = new AuthenticationPage();
		
	}

	@Given("Je me connecte sur l aplication Mercury")
	public void jeMeConnecteSurLAplicationMercury() {

		authenticationpage.goToUrl();

	}

	@When("Je saisie le User Name {string}")
	public void jeSaisieLeUserName(String name) {
		authenticationpage.fillUserName(name);
	}

	@When("Je saisie le Password {string}")
	public void jeSaisieLePassword(String password) {
		authenticationpage.fillPassword(password);
	}

	@When("je clique sur le button Submit")
	public void jeCliqueSurLeButtonSubmit() {
		authenticationpage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthenticationPage.welcomeMessage.getText();
		Assert.assertEquals(message, text);
	}

}
