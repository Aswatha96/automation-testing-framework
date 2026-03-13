package tests;

import base.BaseTest;
import pages.*;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest(){

        LoginPage login = new LoginPage(page);
        CartPage cart = new CartPage(page);
        CheckoutPage checkout = new CheckoutPage(page);

        login.login("standard_user","secret_sauce");

        cart.addProduct();
        cart.openCart();

        checkout.checkout("John","Doe","680001");
    }
}