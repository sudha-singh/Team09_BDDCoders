package stepDefinitionsAssignment;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment;
import utilities.LoggerLoad;

public class ManageassignmentSD8 {
	
	@Given("Admin is in delete alert")
	public void Admin_is_in_delete_alert() {
		System.out.format("Admin is in delete alert");
		
	}
	@When("Admin clicks yes button")
	public void Admin_clicks_yes_button() {
		System.out.format("Admin clicks yes button");
	}
	@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
	public void Redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
		System.out.format("Redirected to assignment page and selected assignment details are deleted from the data table");
		
	  	  try { 
	  	  }
	  	  catch(AssertionError e) {
	  		 LoggerLoad.info("Disabled delete Icon " + e);
	  	  }
	  	LoggerLoad.info("Delete icon is disabled");
	
	}
	
	
	@When("Admin clicks no button")
	public void Admin_clicks_no_button() {
		System.out.format("Admin clicks no button");
	}
	@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
	public void Redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
		System.out.format("Redirected to assignment page and selected assignment details are not deleted from the data table");
		try {
		
			LoggerLoad.info("Redirected to assignment page and selected assignment details are not deleted from the data table");
		}
		catch (Exception e) {
			LoggerLoad.info("details are not deleted from the data table" + e);
		}
		
	}

}
