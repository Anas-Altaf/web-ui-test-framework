package org.codcop.automation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is on login page")
    public void user_is_on_login_page() {
        // Implement the logic to navigate to the login page
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        // Implement the logic to enter username and password
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        // Implement the logic to verify the user is logged in
    }
}