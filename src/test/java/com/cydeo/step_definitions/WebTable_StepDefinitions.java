package com.cydeo.step_definitions;

import com.cydeo.pages.WT_LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDefinitions {


    WT_LoginPage logIn = new WT_LoginPage();

    @Given("user is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");

    }
    @When("user enters correct username")
    public void user_enters_correct_username() {

         logIn.inputUsername.sendKeys("Test");

    }
    @When("user enters correct password")
    public void user_enters_correct_password() {

         logIn.inputPassword.sendKeys("Tester");

    }
    @When("user clicks to logIn button")
    public void user_clicks_to_log_in_button() {

        logIn.logInButton.click();

    }
    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {

        String actualURL = Driver.getDriver().getCurrentUrl();

        String expectedInURL = "orders";


        Assert.assertTrue(actualURL.contains(expectedInURL));

    }


    @When("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String username, String password) {

        logIn.inputUsername.sendKeys(username);

        logIn.inputPassword.sendKeys(password);



    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> credentials) {

        logIn.inputUsername.sendKeys(credentials.get("username"));


        logIn.inputPassword.sendKeys(credentials.get("password"));

    }






}
