package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CustomerService;
import pages.HomePage;
import pages.SignInPage;

public class CustomerServiceTests extends ApplicationManager {

    HomePage homePage;
    SignInPage signInPage;
    CustomerService customerService;

    @BeforeMethod
    public void navigationToCustomerService() {
        homePage = new HomePage(getDriver());
        homePage.clickButtonSignIn();
        signInPage = new SignInPage(getDriver());
        signInPage.fillSignInForm();
        homePage.clickTabCustomerService();
    }

    @Test
    public void navigationToTabWheresMyStaff() {
        customerService = new CustomerService(getDriver());
        customerService.clickTabWheresMyStaff();
        Assert.assertTrue(customerService.validateTitleAllHelpTopics("All help topics"));
    }

}
