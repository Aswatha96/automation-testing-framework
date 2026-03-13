package pages;

import com.microsoft.playwright.Page;

public class CartPage {

    Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    String addProduct = "#add-to-cart-sauce-labs-backpack";
    String cartIcon = ".shopping_cart_link";

    public void addProduct() {

        page.click(addProduct);
    }

    public void openCart() {

        page.click(cartIcon);
    }
}