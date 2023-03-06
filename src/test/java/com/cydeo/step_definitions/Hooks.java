package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setUpMethod(){
        System.out.println("Running before each scenario");

    }

    @Before (value ="@librarian", order = 2)
    public void setUpMethodForLogIn(){
        System.out.println("Running before librarian scenario");

    }

    @After
    public void tearDownMethod(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshot =
                    ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("Running after each scenario");
        BrowserUtils.sleep(5);

        Driver.closeDriver();

    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("RUNNING before each step");

    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("RUNNING before each step");

    }


}
