package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.*;

public class HomeTest extends BaseTest{
    HomePage homeObject;
    LoginPage loginObject;


    @Test
    public void userCanAddProduct() {
        //Login again to add to user cart
        homeObject = new HomePage(page);
        page.waitForSelector("//a[@id='login2']");
        homeObject.loginButton();
        loginObject = new LoginPage(page);
        loginObject.LogInUser("ahmedamr2@gmail.com", "12345");
        homeObject = new HomePage(page);
        //This line opens "Monitor" and looks for product then add it to cart
        homeObject.MonitorButton();
        homeObject.cartButton();
        page.waitForURL("https://www.demoblaze.com/cart.html");

    }

}


