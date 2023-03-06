package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions{

    @Given("user is on the login page of the application")
    public void user_is_on_the_login_page_of_the_application() {
        System.out.println("User is on the log in page of the application");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");

    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters student username");
    }

    @And("user enter student password")
    public void userEnterStudentPassword() {
        System.out.println("User enters student username");
    }

    @When("user enters admin  username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username");
    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("User enters admin username");
    }
}
