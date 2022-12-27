package com.stepdef.in;

import org.openqa.selenium.WebDriver;

import com.BaseClass.in.BaseClassPrjct;
import com.runner.in.Runner;

import io.cucumber.java.en.*;

public class Steps extends BaseClassPrjct {
	

	public static WebDriver driver= Runner.driver;
	POM pom = new POM(driver);
	@Given("page should be launched")
	public void page_should_be_launched() {

		getTheUrl("https://adactinhotelapp.com/");
	}

	@When("user enters the username in the Username field")
	public void user_enters_the_username_in_the_username_field() {
		enterValue(pom.getUsername(), "AryaGeetha1998");
	}

	@When("user enters password in the Password field")
	public void user_enters_password_in_the_password_field() {

		enterValue(pom.getPassword(), "Aryag@00098");
	}

	@Then("click on the Login button.")
	public void click_on_the_login_button() {

		clickOnElement(pom.getLogin());
	}
}
