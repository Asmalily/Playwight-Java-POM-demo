package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homeObject;
    LoginPage loginObject;

    @Test(priority = 2)
    public void userCanLoginWithValidData() {
        homeObject = new HomePage(page);
        page.waitForSelector("//a[@id='login2']");
        homeObject.loginButton();
        loginObject = new LoginPage(page);
        loginObject.LogInUser("ahmedamr2@gmail.com", "12345");

        //Assert presence of Logout button
        String expectedText = "Log out";
        String actualText = page.locator("//a[@id='logout2']").textContent();
        Assert.assertEquals(actualText, expectedText, "Text mismatch");
    }

    @Test(dependsOnMethods = "userCanLoginWithValidData")
    public void userCanLogout() {
        homeObject = new HomePage(page);
        page.waitForSelector("//a[@id='logout2']");
        homeObject.logoutButton();
    }
}
