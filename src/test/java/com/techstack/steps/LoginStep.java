package com.techstack.steps;

import java.util.List;

import org.openqa.selenium.By;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;

import com.techstack.Base.BaseUtil;
import com.techstack.beans.User;
import com.techstack.pages.LoginPage;
import com.techstack.transformer.EmailTransformer;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class LoginStep extends BaseUtil {
	private BaseUtil base;
	
	private String url;
	private Response response;

	public LoginStep(BaseUtil base) {
		super();
		this.base = base;
	}

	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
		base.driver.navigate().to("http://localhost:9989/login");
		System.out.println("I Navigate to the loing page");
	}

	@And("^I click login button$")
	public void iClickLoginButton() throws Throwable {
		

		LoginPage page  = new LoginPage(base.driver);
		page.clickLogin();
		//base.driver.findElement(By.name("login")).submit();
		System.out.println("I clicked login button ");
	}

	@Then("^I should see login form$")
	public void iShouldSeeLoginForm() throws Throwable {
		Assert.assertEquals("This is not displayed", base.driver.findElement(By.id("welcome")).isDisplayed(), true);
		System.out.println("I should see login form ");
	}

	@And("^I enter following details$")
	public void iEnterFollowingDetails(DataTable dataTable) throws Throwable {
		/*
		 * List<List<String>> raw = dataTable.raw(); for ( int i =0; i<raw.size(); i++)
		 * System.out.println(raw.get(i));
		 */

		// With custom class with strongly typed values above is not strongly typed

		List<User> asList = dataTable.asList(User.class);

		LoginPage page  = new LoginPage(base.driver);
		for (User user : asList) {
			/*
			 * System.out.println("User Name :" +user.getUserName());
			 * System.out.println("passsword : " + user.getPassword());
			 */
	/*		base.driver.findElement(By.name("userId")).sendKeys(user.getUserName());
			base.driver.findElement(By.name("password")).sendKeys(user.getPassword());
*/
			page.Login(user.getUserName(), user.getPassword());
		}

	}

	@And("^I enter \"([^\"]*)\" address without domain name$")
	public void iEnterAddressWithoutDomainName(@Transform(EmailTransformer.class) String email) throws Throwable {
		System.out.println(email);
	}

	@And("^I entered \"([^\"]*)\" system will return$")
	public void iEnteredSystemWillReturn(String arg1) throws Throwable {
	}

	@Given("^the API is up and running with following URL \"([^\"]*)\"$")
	public void theAPIIsUpAndRunningWithFollowingURL(String url) throws Throwable {
		this.url =url;
		response = given().when().get(url);
		Assert.assertEquals(200, response.getStatusCode());
	}

	/*
	 * @And("^I enter username as \"([^\"]*)\" and \"([^\"]*)\" as admin$") public
	 * void iEnterUsernameAsAndAsAdmin(String username, String password) throws
	 * Throwable { System.out.println("UserName  : " + username + "\nPassword  :" +
	 * password); }
	 */
}
