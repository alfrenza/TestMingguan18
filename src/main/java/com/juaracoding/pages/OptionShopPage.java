package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OptionShopPage {
    private WebDriver driver;

    public OptionShopPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement chooseColor;

    @FindBy(xpath = "//*[@id=\"pa_color\"]/option[2]")
    WebElement choosePinkBlack;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement chooseSize;

    @FindBy(xpath = "//*[@id=\"pa_size\"]/option[4]")
    WebElement chooseSize38;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/div/div/button[2]/i")
    WebElement quantityShirt;

    @FindBy(xpath = "//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/div/div/button[2]/i")
    WebElement quantityShirtHeels;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addToCartShirt;

    @FindBy(xpath = "//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addToCartHeels;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
    WebElement viewCart;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div")
    WebElement txtSuccessAddedCart;

    public void optionChooseColor(){
        chooseColor.click();
    }

    public void pinkBlackOption(){
        choosePinkBlack.click();
    }

    public void optionChooseSize(){
        chooseSize.click();
    }

    public void sizeOption38(){
        chooseSize38.click();
    }

    public void setQuantityShirt(){
        quantityShirt.click();
    }

    public void setQuantityShirtHeels(){
        quantityShirtHeels.click();
    }

    public  void btnAddToCartShirt(){
        addToCartShirt.click();
    }

    public void btnAddToCartHeels(){
        addToCartHeels.click();
    }

    public void btnViewCart(){
        viewCart.click();
    }

    public String getTxtSuccessAddedCart(){
        return txtSuccessAddedCart.getText();
    }

}
