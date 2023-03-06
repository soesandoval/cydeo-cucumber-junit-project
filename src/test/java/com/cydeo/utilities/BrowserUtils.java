package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    //Method accepts seconds and executes Thread.sleep for given seconds
    public static void sleep(int second){
        second *=1000;

        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(String expectedInURL, String expectedTitle){


        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("driver.getCurrentUrl() = " +   Driver.getDriver().getCurrentUrl());

            if (  Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }


        String actualTitle =   Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

    public static void verifyTitle( String expectedTitle){

        Assert.assertTrue(  Driver.getDriver().getTitle().contains(expectedTitle));
    }

    public static List<String> dropdownOptions_as_String( WebElement dropdownName){

        Select month = new Select(dropdownName);

        List<WebElement> actualMonth_as_WE= month.getOptions();

        List<String> actualMonth_as_String = new ArrayList<>();

        for (WebElement each : actualMonth_as_WE) {

            actualMonth_as_String.add(each.getText());

        }

        return actualMonth_as_String;
    }


    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){

        for (WebElement each : radioButtons) {
           if(each.getAttribute("value").equals(attributeValue)){

               each.click();

            }
        }
    }


}
