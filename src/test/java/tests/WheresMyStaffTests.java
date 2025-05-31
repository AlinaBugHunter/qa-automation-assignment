package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CustomerService;
import pages.HomePage;
import pages.SignInPage;
import pages.TrackYourOrdersPage;

public class WheresMyStaffTests extends ApplicationManager {

    HomePage homePage;
    SignInPage signInPage;
    CustomerService customerService;
    TrackYourOrdersPage trackYourOrdersPage;

    @BeforeMethod
    public void navigationToTabWheresMyStaff() {
        homePage = new HomePage(getDriver());
        homePage.clickButtonSignIn();
        signInPage = new SignInPage(getDriver());
        signInPage.fillSignInForm();
        homePage.clickTabCustomerService();
        customerService = new CustomerService(getDriver());
        customerService.clickTabWheresMyStaff();
    }

    @Test
    public void navigationToTrackYourPackage() {
        customerService.clickTabTrackYourPackage();
        trackYourOrdersPage = new TrackYourOrdersPage(getDriver());
        Assert.assertTrue(trackYourOrdersPage.validateTitleTrackingYourPackage("Tracking your package"));
    }

}
