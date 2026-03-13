package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    String username = "#user-name";
    String password = "#password";
    String loginBtn = "#login-button";

    public void login(String user, String pass) {

        page.fill(username, user);
        page.fill(password, pass);
        page.click(loginBtn);
    }
}