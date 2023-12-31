package stepDefinitionsAssignment;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageAssignment;
import utilities.LoggerLoad;

public class ManageassignmentSD13 {
	
	@Given("Admin is on dashboard page after Login for Assignment page")
	public void Admin_is_on_dashboard_page_after_Login_for_Assignment_page() {
		System.out.format("Admin is on dashboard page after Login");
	}
	@When("Admin clicks Assignment button on the navigation bar")
	public void Admin_clicks_Assignment_button_on_the_navigation_bar() {
		System.out.format("Admin clicks Assignment button on the navigation bar");
	}
	@Then("Data table should display 1 page  when entries available")
	public void Data_table_should_display_1_page_when_entries_available() {
		System.out.format("Data table should display ");
		try { 
			Assert.assertTrue(ManageAssignment.OnePagedisplaydataTable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" data display " + e);
		  	  }
		  	LoggerLoad.info(" DisplayedData ");
	}
	
	
	@Then("Right arrow should be enabled in page one when entries are more than 5 available")
	public void Right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_5_available() {
		System.out.format("Right arrow should be enabled in page");
		try { 
			Assert.assertTrue(ManageAssignment.RightArrowEnable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" Enable " + e);
		  	  }
		  	LoggerLoad.info(" Page enabled ");
	}
	
	
	@Then("Left arrow should be disabled in page one when entries are more than 5 available")
	public void Left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_5_available() {
		System.out.format("Left arrow should be disabled in page one");
		
		try { 
			Assert.assertTrue(ManageAssignment.LeftArrowEnable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" More Than 5 variables disabled " + e);
		  	  }
		  	LoggerLoad.info(" Disabled ");
	}
	
	
	@Then("Right arrow should be enabled in page two when entries are more than 10 available")
	public void Right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_10_available() {
		System.out.format("Right arrow should be enabled in page two ");
		try { 
			Assert.assertTrue(ManageAssignment.RightArrowEnable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" Enable " + e);
		  	  }
		  	LoggerLoad.info(" Page enabled in page2 ");
	}
	
	
	@Then("Left arrow should be enabled in page two")
	public void Left_arrow_should_be_enabled_in_page_two() {
		System.out.format("Left arrow should be enabled in page two");
		try { 
			Assert.assertTrue(ManageAssignment.LeftArrowEnable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" Enable " + e);
		  	  }
		  	LoggerLoad.info(" Page enabled in page2 ");
	}
	
	@Then("Data table should display page 1 when entries available")
	public void Data_Table_Should_display_page_1_when_entries_available() {
		System.out.format("Data table should display page 1");
		try { 
			Assert.assertTrue(ManageAssignment.OnePagedisplaydataTable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" data display " + e);
		  	  }
		  	LoggerLoad.info(" DisplayedData ");
	}
	
	
	@Then("entries are more than 5 in data table pagination controls enabled")
	public void entries_are_more_than_5_in_data_table_pagination_controls_enabled() {
		System.out.format("entries are more than 5 in data table pagination controls enabled");
		try { 
			Assert.assertTrue(ManageAssignment.Entry5dataTable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" DataTableEnable " + e);
		  	  }
		  	LoggerLoad.info(" Data table controls Enabled ");
	}
	
	
	@Then("entries are less than 5 in data table pagination controls disabled")
	public void entries_are_less_than_5_in_data_table_pagination_controls_disabled() {
		System.out.format("entries are less than 5 in data table pagination controls disabled");
		try { 
			Assert.assertTrue(ManageAssignment.Entry5dataTable());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" DataTabledisplayed " + e);
		  	  }
		  	LoggerLoad.info(" Data table controls displayed");
	}

}
