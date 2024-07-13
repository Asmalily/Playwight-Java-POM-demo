package Tests;

import Pages.HomePage;
import Pages.signupPage;
import org.testng.annotations.Test;


public class SignupTest extends BaseTest{
    HomePage homeObject;
    signupPage signupObject;


    /// Sign up Testcase
    @Test(priority = 1)
    public void userCanSignupWithValidData() {
        homeObject = new HomePage(page);
        homeObject.signUpButton();
        signupObject = new signupPage(page);
        //Sign up with valid data
        signupObject.signupForm("ahmedamr2@gmail.com", "12345");
    }}
