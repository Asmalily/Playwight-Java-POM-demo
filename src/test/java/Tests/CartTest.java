package Tests;

import Pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CartTest extends BaseTest {


    CartPage CartObject;

    @Test
    public void userCanCreateOrderForAnAppleMonitor24() {
        CartObject = new CartPage(page);
        page.navigate("https://www.demoblaze.com/cart.html");
        CartObject.orderComplete("Milla", "Egypt", "Cairo"
                , "EgyBank", "9", "2020");
        CartObject.Confirm();
        //Assertion for success purchase
        String expectedText = "Thank you for your purchase!";
        String actualText = page.locator("(//h2)[3]").textContent();
        Assert.assertEquals(actualText, expectedText, "Text mismatch");
        CartObject.ClickOnOk();
        page.close();


    }


}