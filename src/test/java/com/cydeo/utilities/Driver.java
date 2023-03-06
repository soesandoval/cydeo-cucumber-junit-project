package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {


//Create a private constructor to remove access to this object

    private Driver() {

    }

    //We make the webdriver private, bc we want to close access from outside the class
    private static WebDriver driver;

    // create a reusable utility method which wll return the same driver instance once we call it
    // if an instance doesn't exist, it will create first, and then it will always return that same instance
    public static WebDriver getDriver() {

        if (driver == null) {
            //we will read our browserType from configuration properties file. this way we can control which browsers opened from outside our code.
            String browserType = ConfigurationReader.getProperty("browser");

            //depending  on the browserType return from config properties, switch will determine the case and open matching browser
            switch (browserType) {
                case "chrome":
                    // WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                    break;
                case "firefox":
                    //WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                    break;
            }

        }

        return driver;

    }


    public static void closeDriver() {

        if (driver != null) {

            driver.quit();

            driver = null;

        }

    }






}

