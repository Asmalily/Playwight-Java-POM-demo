package Pages;

import com.microsoft.playwright.Page;

public class HomePage  {

    private final Page page;
    String signUp= "//a[@id='signin2']";
    String loginButton="//a[@id='login2']";

    String logoutButton="(//a[@id='logout2']";

    String MonitorButton="//a[4]";

    String MonitorProduct="//a[normalize-space()='Apple monitor 24']";

    String AddtoCardButton="//a[@class='btn btn-success btn-lg']";

    String CartButton="//a[normalize-space()='Cart']";


    public HomePage(Page page) {
        this.page = page;}

    //Sign up button on Home Page
    public void signUpButton(){
        page.click(signUp);
    }


    //Login button on Home page
    public void loginButton(){

        page.click(loginButton);
}
//logout on Home page
    public void logoutButton() {
        page.click("//a[@id='logout2']");
    }

    public void MonitorButton(){
            page.click(MonitorButton);
            page.click(MonitorProduct);
            page.click(AddtoCardButton);
    }
    public void cartButton(){
        page.waitForSelector("//a[normalize-space()='Cart']");
        page.click(CartButton);

    }


}