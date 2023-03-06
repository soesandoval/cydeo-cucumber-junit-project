package com.cydeo.step_definitions;

import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.pages.WT_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.Browser;

import java.util.List;

public class WebTableGeneral_StepDefinitions {


    WT_LoginPage logInPage = new WT_LoginPage();
    WT_OrderPage orderPage = new WT_OrderPage();

    @Given("User is already logged in to the Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        logInPage.login();

    }
    @When("user is on the Order page")
    public void user_is_on_the_order_page() {

        orderPage.orderLink.click();

    }
    @Then("user sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedoptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_String(orderPage.productDropdown);

        Assert.assertEquals(actualOptions, expectedoptions);

    }


    @Then("user sees below visa radio button")
    public void user_sees_below_visa_radio_button() {


        orderPage.visaRadioButton.click();

        Assert.assertTrue(orderPage.visaRadioButton.isEnabled());

    }
    @Then("user sees below mastercard radio button")
    public void user_sees_below_mastercard_radio_button() {

        orderPage.masterRadioButton.click();

        Assert.assertTrue(orderPage.masterRadioButton.isEnabled());

    }
    @Then("user sees below american express radio button")
    public void user_sees_below_american_express_radio_button() {

        orderPage.americanRadioButton.click();

        Assert.assertTrue(orderPage.americanRadioButton.isEnabled());


    }


    @Then("user enters {string} as quantity")
    public void userEnters(String quantity) {

        orderPage.quantity.clear();
//orderPage.quantity.sendKeys(Keys.BACK_SPACE);

        orderPage.quantity.sendKeys(quantity);

    }

    @Then("user enters {string} as name")
    public void userEntersAsName(String name) {

        orderPage.customerName.sendKeys(name);

    }

    @Then("user enters {string} as street, {string} as city, {string} as state, and {string} as zip")
    public void userEntersAsStreetAsCityAsStateAndAsZip(String street, String city, String state, String zip) {

        orderPage.street.sendKeys(street);

        orderPage.city.sendKeys(city);

        orderPage.state.sendKeys(state);

        orderPage.zip.sendKeys(zip);


    }

    @Then("user enters {string} as card number, and {string} as expiration date")
    public void userEntersTypeOfCardAsCardNumberAndAsExpirationDate(String cardNo, String expirationDate) {

        orderPage.CardNo.sendKeys(cardNo);

        orderPage.expirationDate.sendKeys(expirationDate);


    }

    @And("user clicks to process order")
    public void userClicksTo() {

        orderPage.processOrderButton.click();

    }

    @Then("user clicks the calculate button")
    public void userClicksTheCalculateButton() {

        orderPage.calculateButton.click();

    }

    @Then("user selects payment option {string}")
    public void userSelectsPaymentOption(String cardType) {
        BrowserUtils.clickRadioButton(orderPage.cardTypes, cardType);

    }
    WT_ViewAllOrdersPage allOrders = new WT_ViewAllOrdersPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String name) {

        String actualName = allOrders.newCustomerCell.getText();

        Assert.assertEquals(actualName, name);




    }
}
