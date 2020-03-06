package com.hrms.steps;

import org.junit.Assert;
import com.hrms.utils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {

	@Given("I open browser and navigated to the HRMS")
	public void i_open_browser_and_navigated_to_the_HRMS() {
		System.out.println("Opening browser");
		Assert.assertEquals(10, 10);

	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_usename_and_valid_password() {
		System.out.println("Entering valid Username and Password");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		System.out.println("Clicking on login button");

	}

	@Then("I succesfully logged in")
	public void i_succesfully_logged_in() {
		System.out.println("I am logged in");
	}

	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
		System.out.println("I enter Valid username and envalid pass");
	}

	@Then("I see error message")
	public void i_see_error_message() {

		System.out.println("Error message displayed");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) throws InterruptedException {
		System.out.println(username+" "+ password);
	}

	@Then("I see {string}")
	public void i_see(String ErrorMessage) {
		System.out.println("I see "+ErrorMessage);
	}

}
