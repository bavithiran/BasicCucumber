package stepdefs;

import java.util.concurrent.TimeUnit;

import actiondefs.MainActionFlow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoDefinitions {

	MainActionFlow MNF = new MainActionFlow();


	
	@Given("^Launch browser$") 
	public void Launch_browser() throws InterruptedException{
		MNF.qaBrowserLaunch();
	}

	@Then("^Enter EmailID$") 
	public void Enter_EmailID(){
		MNF.qaEnterEmailID();
	}

	@Then("^Enter Password$") 
	public void Enter_Password(){
		MNF.qaEnterPassword();

	}

	@Then("^Click SignIn$") 
	public void Click_SignIn(){
		MNF.qaClickSignInButton();

	}

	@Then("^Verify AccountName$") 
	public void Verify_AccountName(){
		MNF.qaVerifyAccountName();
	}

	@Given("^Launch chrome Browser for Salesforce Website$")
	public void i_want_to_write_a_step_with_precondition() throws Exception {

		System.out.println("Launching Browser.............");
		MNF.Launch_Browser();

	}

	@Given("^Enter \"([^\"]*)\" and \"([^\"]*)\" value$")
	public void Enter_Username_password(String UserName, String Password) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String US = UserName;
		String PA = Password;
		System.out.println("Enter_Username And password.........");
		MNF.Enter_UserName_and_Password(US, PA);

	}

	@Then("^Quit the Browser$")
	public void quit_the_Browser() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Quitting the Browser..........");
		MNF.Quit_Browser();
	}
	
	@When("^Wait time \"([^\"]*)\" in Seconds$")
	public void Wait_time_Step(String Time) throws InterruptedException
	{
		System.out.println("Waiting For.."+ Time + "..Seconds");
		MNF.Wait_Custom(Time);
	}
	
	@Then("^Click Exact \"([^\"]*)\" BU Name$")
	public void Click_Exact_BU(String BUName)
	{
		System.out.println("Clicking the.."+BUName+"..BusinessUnit");
		MNF.ExactBu_Click(BUName);
	}
	
	@Then("^Click the Main arrow of BU$")
	public void click_the_arrow_of_BU()
	{
		System.out.println("Clicking the Arrow of the Business Unit ListDropdown.......");
		MNF.BU_Arrow_Click();
	}
	
	@Then("^Move to Journey Builder$")
	public void Move_to_Journey_Builder() throws InterruptedException
	{
		System.out.println("Moving to Journey Builder...........");
		MNF.Main_JourneyBuilder();
		TimeUnit.SECONDS.sleep(2);
		MNF.JourneyBuilderListClick();
		//MNF.ExpectedWaitUntil_JorneyBuilderPage();
		System.out.println("JourneyBuilderPage is Visible..........");
		
	}
	
	@Then("^Search Journey Name$")
	public void Search_JourneyName()
	{
		System.out.println("JourneyName search ..............");
		MNF.JourneySearch();
	}
	
	

}
