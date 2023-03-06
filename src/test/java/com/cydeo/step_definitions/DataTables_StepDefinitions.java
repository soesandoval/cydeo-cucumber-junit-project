package com.cydeo.step_definitions;

import com.cydeo.pages.Dropdown;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    @Then("user should see the list")
    public void user_should_see_the_list(List<String> listOf) {

        System.out.println("listOf = " + listOf);

        System.out.println("listOf.get(1) = " + listOf.get(1));


    }

    @Then("user should see list of pets")
    public void userShouldSeeListOfPets(List<String> listOfPets) {

        System.out.println("listOfPets = " + listOfPets);

    }


    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {

        System.out.println("driverInfo = " + driverInfo);

        System.out.println("driverInfo.size() = " + driverInfo.size());

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));


    }

    Dropdown dropdownP = new Dropdown();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {


        Assert.assertEquals(expectedMonths, BrowserUtils.dropdownOptions_as_String(dropdownP.monthDropdown));


    }



}
