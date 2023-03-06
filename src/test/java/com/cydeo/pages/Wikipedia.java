package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {

    public Wikipedia(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput" )
    public WebElement searchBox;

    @FindBy(tagName = "button")
    public WebElement searchButton;



}
