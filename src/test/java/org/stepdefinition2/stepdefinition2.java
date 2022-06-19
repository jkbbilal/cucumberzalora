package org.stepdefinition2;

import java.io.IOException;

import org.utilities.baseclass;
import org.utilities.pojoclass;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class stepdefinition2 extends baseclass {
	pojoclass p;

@Before
	@Given("user should launch chrome browser and load the url")
	public void user_should_launch_chrome_browser_and_load_the_url() throws InterruptedException {
		launchchrome();
		winmax();
		loadurl("https://www.zalora.sg/");
		Thread.sleep(3000);
	}

	@When("user click the account icon and login")
	public void user_click_the_account_icon_and_login() throws InterruptedException {
		p = new pojoclass();
		accounticon(p.getAccounticon());
		Thread.sleep(2500);
		loginiconclik(p.getLogin());

	}

	@When("user should type valid username and password")
	public void user_should_type_valid_username_and_password() throws IOException {
		p = new pojoclass();
		fillemail(p.getEmailid(), getdata(1, 0));
		fillpass(p.getPassword(), getdata(2, 1));
	}

	@When("please click login button")
	public void please_click_login_button() {
		p = new pojoclass();
		loginbuttonclick(p.getSubmitlogin());
	}

	@Then("navigate back to homepage")
	public void navigate_back_to_homepage() {

		gobackpage();
	}

	@Then("click the women section")
	public void click_the_women_section() {
		p = new pojoclass();
		womensectionclik(p.getWomensection());
	}
	

	@When("to enter valid useremail id,valid password,firstname")
	public void toEnterValidUseremailIdValidPasswordFirstname() throws IOException {
		p = new pojoclass();
		fill(p.getEnteruseremail(), getdata(1, 0));
		fill(p.getEnterpass(), getdata(1, 1));
		fill(p.getFirstnameenter(), getdata(3, 0));
		
	}

	@When("select birthday,month and year")
	public void selectBirthdayMonthAndYear() {
		p = new pojoclass();
		choose(p.getBirthdayfill(), "07");
		choose(p.getBirthmonthfill(), "06");
		choose(p.getBirthyearfill(), "2022");
	}

	@Then("click confirm and continue button")
	public void clickConfirmAndContinueButton() {
		p = new pojoclass();
		registerbuttonclick(p.getConfirmsubmit());
	}

	@When("user should type valid username{string} and password{string}")
	public void userShouldTypeValidUsernameAndPassword(String s1, String s2) {
		p = new pojoclass();
		fill(p.getEmailid(), s1);
		fill(p.getPassword(), s2);
		
	}
	@When("user click the account icon and register")
	public void userClickTheAccountIconAndRegister() throws InterruptedException {
		p = new pojoclass();
		accounticon(p.getAccounticon());
		Thread.sleep(2500);
		registericonclik(p.getClikregister());
	}



}
