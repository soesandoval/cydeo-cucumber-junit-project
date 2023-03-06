package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends WT_Homepage{

    public WT_OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "product")
    public WebElement productDropdown;

     @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterRadioButton;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanRadioButton;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy(name = "card")
    public List<WebElement> cardTypes;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zip;

    @FindBy(name = "cardNo")
    public WebElement CardNo;

    @FindBy(name = "cardExp")
    public WebElement expirationDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;









}
