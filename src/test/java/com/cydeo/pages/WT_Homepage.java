package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_Homepage {

    public WT_Homepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='View all orders']")
    public WebElement viewAllOrdersLink;

    @FindBy(xpath = "//button[text()='View all products']")
    public WebElement viewAllProductsLink;

    @FindBy(xpath = "//button[text()='Order']")
    public WebElement orderLink;

    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logOutLink;

}
