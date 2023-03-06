package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia;
import com.cydeo.pages.WikipediaResults;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wikipedia_StepDefinitions {

        Wikipedia wiki = new Wikipedia();
        WikipediaResults wikiR = new WikipediaResults();

        @Given("user is on the wikipedia homepage")
        public void userIsOnTheWikipediaHomepage() {
                Driver.getDriver().get("https://www.wikipedia.org/");
                BrowserUtils.sleep(2);

        }

        @When("User types {string} in the wiki search box")
        public void user_types_steve_jobs_in_the_wiki_search_box(String searchValue) {

                wiki.searchBox.sendKeys(searchValue);
                BrowserUtils.sleep(2);

        }
        @Then("User clicks wiki search button")
        public void user_clicks_wiki_search_button() {

                wiki.searchButton.click();

                BrowserUtils.sleep(2);

        }
        @Then("User sees {string} is in the wiki title")
        public void user_sees_steve_jobs_is_in_the_wiki_title(String expectedTitle) {

                BrowserUtils.verifyTitle(expectedTitle);

        }


        @Then("User sees {string} is in the main header")
        public void userSeesSteveJobsIsInTheMainHeader(String expectedMainHeader) {

                String actualHeaderText= wikiR.mainHeader.getText();
                String expectedHeaderText = expectedMainHeader;

                Assert.assertEquals(actualHeaderText,expectedHeaderText);

        }

        @Then("User sees {string} is in the image header")
        public void userSeesIsInTheImageHeader(String expectedImageHeader) {

                String actualText = wikiR.imageHeader.getText();

                Assert.assertEquals(actualText, expectedImageHeader);


        }
}
