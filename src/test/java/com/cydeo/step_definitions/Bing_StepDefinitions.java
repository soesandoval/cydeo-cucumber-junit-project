package com.cydeo.step_definitions;

import com.cydeo.pages.Bing;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Bing_StepDefinitions {

    Bing bing = new Bing();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_Search_Page(){
        Driver.getDriver().get("https://www.bing.com");
        BrowserUtils.sleep(5);

    }


    @Then("user should see title contain orange")
    public void user_should_see_title_contain_orange() {
        BrowserUtils.sleep(3);

        BrowserUtils.verifyTitle("orange");

    }


    @When("user search for  {string}")
    public void userSearchFor(String orange) {

        bing.searchBox.sendKeys(orange +Keys.ENTER);
        BrowserUtils.sleep(2);


    }
}
