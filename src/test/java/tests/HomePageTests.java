package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

public class HomePageTests extends ApplicationManager {

    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void signIn() {
        homePage = new HomePage(getDriver());
        homePage.clickButtonSignIn();
        signInPage = new SignInPage(getDriver());
        signInPage.fillSignInForm();
    }

    @Test
    public void navigationToCustomerService() {
        homePage.clickTabCustomerService();
        Assert.assertTrue(homePage.validateTitleWelcome("Welcome to Amazon Customer Service"));
    }

}
