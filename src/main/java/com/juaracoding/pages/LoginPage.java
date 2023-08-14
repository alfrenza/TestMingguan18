package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator FindBy
    @FindBy(xpath =  "//*[@id=\"username\"]")
    WebElement username;

    @FindBy(xpath =  "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath =  "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/section/div/div/h1")
    WebElement txtDashboardLogin;

    //Costum method
    public void login(){
        username.sendKeys("alfrenzaburhannudin@gmail.com");
        password.sendKeys("ilovedota");
        btnLogin.click();
    }


    public String getTextDashboardLogin(){
        return txtDashboardLogin.getText();
    }

    //Method Return
}
