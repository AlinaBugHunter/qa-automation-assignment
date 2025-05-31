package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

public class SignInTests extends ApplicationManager {

    HomePage homePage;
    SignInPage signInPage;

    // Tests sign-in and checks that "Sign Out" appears after hovering over the account menu
    @Test
    public void signInTest() {
        homePage = new HomePage(getDriver());
        homePage.clickButtonSignIn();
        signInPage = new SignInPage(getDriver());
        signInPage.fillSignInForm();
        Assert.assertTrue(signInPage.hoverAndValidateSignOut("Sign Out"));
    }

}
