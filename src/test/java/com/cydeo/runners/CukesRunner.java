package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/reports.html",
        features="src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun= false, //false no change, true means it will return snippet only
        tags="@dataTest2",
        publish = true
)
public class CukesRunner {

}
