package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
    private WebDriver driver;

    public ShopPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/span")
    WebElement zoomPinkShirt;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/a")
    WebElement btnToSelectOptionShopPage;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/div[1]/div[1]/span")
    WebElement zoomBlackHeels;

    public void btnZoom(){
        zoomPinkShirt.click();
    }

    public void btnSelectOption(){
        btnToSelectOptionShopPage.click();
    }

    public void btnZoomBlackHeels(){
        zoomBlackHeels.click();
    }


}
