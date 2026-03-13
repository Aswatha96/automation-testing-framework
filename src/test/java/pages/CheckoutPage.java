package pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {

    Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public void checkout(String f,String l,String zip){

        page.click("#checkout");

        page.fill("#first-name",f);
        page.fill("#last-name",l);
        page.fill("#postal-code",zip);

        page.click("#continue");
        page.click("#finish");
    }
}