package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    private WebDriver driver;

    public CheckOutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"terms\"]")
    WebElement checkListOrder;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    WebElement btnOrder;

    public void setCheckListOrder(){
        checkListOrder.click();
    }

    public void setBtnOrder(){
        btnOrder.click();
    }

}
