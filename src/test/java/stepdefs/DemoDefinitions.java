package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import actiondefs.MainActionFlow;

public class DemoDefinitions {

	MainActionFlow MNF = new MainActionFlow();

	@Given("^Launch chrome Browser for Salesforce Website$")
	public void i_want_to_write_a_step_with_precondition() throws Exception {
		
		System.out.println("Launching Browser");
		MNF.Launch_Browser();

	}

	@Given("^Enter \"([^\"]*)\" and \"([^\"]*)\" value$")
	public void Enter_Username_password(String UserName , String Password) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String US = UserName;
		String PA = Password;
		System.out.println("Enter_Username_password.........");
		MNF.Enter_UserName_and_Password(US,PA);
		
		
	}
	
	
	
	@Then("^Quit the Browser$")
	public void quit_the_Browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    MNF.Quit_Browser();
	}

	@When("^I complete action$")
	public void i_complete_action() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^some other action$")
	public void some_other_action() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^yet another action$")
	public void yet_another_action() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	

}
