package com.hrms.steps;


import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddEmployeeSteps extends CommonMethods {

	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
	    System.out.println("I'm logged to HRMS");
	}
	
	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
		System.out.println("Navigate to Add emp page");
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and(String FirstName, String MiddleName, String LastName) {
		System.out.println("another test");
	     
	}

	@When("I click Save")
	public void i_click_Save() {
		System.out.println("click save btn");
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
		System.out.println("Employee added testcase");
	}

	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String FirstName, String MiddleName, String LastName) {
		  System.out.println("emp testcase");
	}

	@When("I delete employee id")
	public void i_delete_employee_id() {
	    Assert.assertTrue(true);
	}

	@Then("I see employee without employee id is being added")
	public void i_see_employee_without_employee_id_is_being_added() {
		System.out.println("employee without emp id");;
	}

	@Then("I see required error message next to the first and last name")
	public void i_see_required_error_message_next_to_the_first_and_last_name() {
		System.out.println("required error message");
	}

	@When("I click on create login checkbox")
	public void i_click_on_create_login_checkbox() {
		System.out.println("click create loging chechbox");
	}

	@When("I enter  {string},{string} and {string}")
	public void i_enter_and(String username, String password, String repassword) {
	  System.out.println("I enter username and pass");
	}
	
	@When("I enter employee details")
	public void i_enter_employee_details(DataTable empDetails) {
		System.out.println("Enter emp details");
	}

	@When("I click on Edit")
	public void i_click_on_Edit() {
		System.out.println("click edit btn");
	}

	@Then("I am able to modify Employee Details")
	public void i_am_able_to_modify_Employee_Details(DataTable modfDetails) throws InterruptedException {
		System.out.println("I'm able to modify emp....");
	}

	
	
	
	
	
	
}
