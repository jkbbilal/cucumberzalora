package org.stepdefinition;

import java.io.IOException;

import org.utilities.baseclass;
import org.utilities.pojoclass;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginStepDefinition extends baseclass {
	@Given("user should launch the chrome browser and load the url")
	public void user_should_launch_the_chrome_browser_and_load_the_url() {
	  launchchrome();
	  loadurl("https://www.facebook.com");
	  winmax();
	}

	@When("user should type valid username and invalid password")
	public void user_should_type_valid_username_and_invalid_password() throws IOException {
	    pojoclass p = new pojoclass();
	    fillemail(p.getTextemail(), getdata(1, 0));
	    fillpass(p.getTextpass(), getdata(1, 1));
	  
	    
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		   pojoclass p = new pojoclass();
		   loginbuttonclick(p.getClicklogin());
		   impwait();
	}

	@Then("user should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
	  String title = driver.getTitle();
	  Assert.assertTrue("verify the title", title.contains("log"));
	  System.out.println("success");
	}

}
