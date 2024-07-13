package Pages;

import com.microsoft.playwright.Page;

public class LoginPage extends HomePage {
    private final Page page;
    String Username = "//input[@id='loginusername']";
    String PassWord = "//input[@id='loginpassword']";
    String loginButton = "(//button[@class='btn btn-primary'])[3]";

    public LoginPage(Page page) {
        super(page);
        this.page = page;
    }

    public void LogInUser(String UserName, String PassWorD) {
        page.fill(Username, UserName);
        page.fill(PassWord, PassWorD);
//        page.waitForSelector("(//button[@class='btn btn-primary'])[3]").isVisible();
        page.click(loginButton);
    }
}
