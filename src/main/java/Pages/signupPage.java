package Pages;

import com.microsoft.playwright.Page;

public class signupPage extends HomePage{
    private final Page page;

    String userNameField ="//input[@id='sign-username']";
    String passwordField="//input[@id='sign-password']";
    String signUpButton="(//button[@class='btn btn-primary'])[2]";



    public signupPage(Page page) {
        super(page);
        this.page=page;
    }

    public void signupForm(String userName, String Password) {
        page.fill(userNameField, userName);
        page.fill(passwordField, Password);
        page.click(signUpButton);

    }}




