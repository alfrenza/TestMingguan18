package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {

    static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");

        LoginPage loginPage = new LoginPage();
        ShopPage shopPage = new ShopPage();
        MyAccountPage myAccountPage = new MyAccountPage();
        OptionShopPage optionShopPage = new OptionShopPage();
        CartPage cartPage = new CartPage();
        CheckOutPage checkOutPage = new CheckOutPage();
        BillPage billPage = new BillPage();

        //Login
        loginPage.login();
        System.out.println(loginPage.getTextDashboardLogin());
        System.out.println("Test Login success");
        DriverSingleton.assertEqual(loginPage.getTextDashboardLogin(), "MY ACCOUNT");

        //Proses Order ke-1
        myAccountPage.myAccount();
        shopPage.btnZoom();
        shopPage.btnSelectOption();
        optionShopPage.optionChooseColor();
        optionShopPage.pinkBlackOption();
        optionShopPage.optionChooseSize();
        optionShopPage.sizeOption38();
        optionShopPage.setQuantityShirt();
        optionShopPage.setQuantityShirt();
        optionShopPage.setQuantityShirt();
        optionShopPage.btnAddToCartShirt();
        System.out.println(optionShopPage.getTxtSuccessAddedCart());
        System.out.println("Test the First Add Cart success");
        DriverSingleton.assertEqual(optionShopPage.getTxtSuccessAddedCart(),"4 × “pink drop shoulder oversized t shirt” have been added to your cart.");
        optionShopPage.btnViewCart();

        //Proses Order ke-2
        cartPage.setBtnContinueShopping();
        shopPage.btnZoomBlackHeels();
        shopPage.btnSelectOption();
        optionShopPage.optionChooseColor();
        optionShopPage.pinkBlackOption();
        optionShopPage.optionChooseSize();
        optionShopPage.sizeOption38();
        optionShopPage.setQuantityShirtHeels();
        optionShopPage.setQuantityShirtHeels();
        optionShopPage.setQuantityShirtHeels();
        optionShopPage.btnAddToCartHeels();
        System.out.println(optionShopPage.getTxtSuccessAddedCart());
        System.out.println("Test the Second Add Cart success");
        DriverSingleton.assertEqual(optionShopPage.getTxtSuccessAddedCart(), "4 × “black pointed toe barely there patent heels” have been added to your cart.");
        optionShopPage.btnViewCart();

        //Proses Checkout
        cartPage.setBtnCheckOut();
        DriverSingleton.delay(3);
        checkOutPage.setCheckListOrder();
        checkOutPage.setBtnOrder();

        //Hasil pesanan
        System.out.println(billPage.txtMessage());
        System.out.println("Test the Transaction is succesS");
        DriverSingleton.assertEqual(billPage.txtMessage(), "Thank you. Your order has been received.");


        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeAsyncScript("window.scrollBy(0,500)");//scroll vertical 500


        //DriverSingleton.closeObjectInstance();
    }
}