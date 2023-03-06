package com.cydeo.step_definitions;

import com.cydeo.pages.Etsy;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Etsy_StepDefinitions {


    Etsy etsy = new Etsy();

    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://ww.etsy.com");
    }
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
       String expectedTitle=" Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        BrowserUtils.verifyTitle(expectedTitle);

    }

    @When("user types {string} in the search box")
    public void user_types_wooden_spoon_in_the_search_box(String searchValue) {

        etsy.searchBox.sendKeys(searchValue);

    }
    @When("user click to Etsy search button")
    public void user_click_to_etsy_search_button() {

        etsy.searchButton.click();

    }
    @Then("user sees {string} is in the title")
    public void user_sees_wooden_spoon_is_in_the_title(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);

    }


}
