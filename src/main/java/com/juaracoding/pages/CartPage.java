package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[2]/td/a[2]")
    WebElement btnContinueShopping;


    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
    WebElement btnCheckOut;

    public void setBtnContinueShopping(){
        btnContinueShopping.click();
    }

    public void setBtnCheckOut(){
        btnCheckOut.click();
    }
}
