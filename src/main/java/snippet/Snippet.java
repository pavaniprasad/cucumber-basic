package snippet;

import java.util.List;

import com.techstack.beans.User;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;

public class Snippet {

/*	@tag
	Feature: To test the Rest endpoint
	  Base line for testing rest endpoints in this application

	  @tag1
	  Scenario: testing remittance endpoint
	    Given I will get the REST URL running on local host
	    And I will pass the "providerId" in remittance test
	      | providerId |
	      | XM         |
	      | UAE        |
	    When I will call the endpointn
	    Then I should get "vendorInfo"
	      | vendorInfo  |
	      | XM          |
	      | ther Vendor |
	      
	      
	      
	 ===============================================     
	      
	        @tag1
  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter followoing details
      | userName | password |
      | admin    | admin    |
      | tulasi   | password |
    And I click login button
    Then I should see login form



	@And("^I enter followoing details$")
	public void iEnterFollowoingDetails(DataTable dataTable) throws Throwable {
		
		/*
		List<List<String>> raw = dataTable.raw();
		 for ( int i =0; i<raw.size(); i++)
			System.out.println(raw.get(i));
		*/
		
		// With custom class with strongly typed values above is not strongly typed
		
		/* List<User> asList = dataTable.asList(User.class);
		
		for (User user : asList) {
			System.out.println("User Name :" +user.getUserName());
			System.out.println("passsword : " + user.getPassword());
		}
	}*/

		//===================================== 

}


