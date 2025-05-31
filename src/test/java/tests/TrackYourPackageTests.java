package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class TrackYourPackageTests extends ApplicationManager {

    HomePage homePage;
    SignInPage signInPage;
    CustomerService customerService;
    TrackYourOrdersPage trackYourOrdersPage;
    YourOrdersPage yourOrdersPage;

    @BeforeMethod
    public void navigationToTrackYourPackage() {
        homePage = new HomePage(getDriver());
        homePage.clickButtonSignIn();
        signInPage = new SignInPage(getDriver());
        signInPage.fillSignInForm();
        homePage.clickTabCustomerService();
        customerService = new CustomerService(getDriver());
        customerService.clickTabWheresMyStaff();
        customerService.clickTabTrackYourPackage();
    }

    @Test
    public void navigationToYourOrders() {
        trackYourOrdersPage = new TrackYourOrdersPage(getDriver());
        trackYourOrdersPage.openLinkYourOrders();
        yourOrdersPage = new YourOrdersPage(getDriver());
        Assert.assertTrue(yourOrdersPage.validateTitleYourOrders("Your Orders"));
    }

}
