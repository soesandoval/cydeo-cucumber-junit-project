package com.cydeo.step_definitions;

import com.cydeo.pages.Google;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    Google google = new Google();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @When("user search for {word}")
    public void userSearchForApple (String word) {

        google.searchBox.sendKeys(word + Keys.ENTER);

    }
    @Then("user should see title contain {string}")
    public void user_should_see_title_as_apple_google_search(String expectedInTittle) {
        String expectedTitle = expectedInTittle +  " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(expectedTitle.equals(actualTitle));

        //BrowserUtils.verifyTitle("apple - Google Search");


    }

}
