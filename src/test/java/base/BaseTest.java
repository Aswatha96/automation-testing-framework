package base;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeMethod
    public void setup() {

        playwright = Playwright.create();

        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext context = browser.newContext();

        page = context.newPage();

        page.navigate("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {

        browser.close();
        playwright.close();
    }
}