package Tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitUntilState;
import org.testng.annotations.*;

import javax.naming.Context;
import java.awt.*;
import java.nio.file.Paths;
import java.security.ProtectionDomain;

import static org.testng.AssertJUnit.assertEquals;


public class BaseTest {
    protected static Page page;


    @BeforeTest
    public void setUp() {
        //Launching
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize().getSize();
        double width= screenSize.getWidth();
        double height= screenSize.getHeight();

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(30));
        BrowserContext context =browser.newContext(new Browser.NewContextOptions().setViewportSize((int) width, (int) height));
        page = context.newPage();
    page.navigate("https://www.demoblaze.com/");

        //& Take ScreenShot
//        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("aa.png")));
//        //Assertion for page title
//        assertEquals("STORE", page.title());
    }

    //Closure after test suite
//    @AfterSuite
//    public void tearDown() {
//        page.close();
//  playwright.close();
//    }


}



//Navigate
//        page = browser.newPage();
//        ///Page url
//        page.navigate("https://www.demoblaze.com/");

