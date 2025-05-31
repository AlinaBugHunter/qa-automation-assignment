package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static utils.PropertiesReader.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        setDriver(driver);
        driver.get(getProperty("login.properties", "url"));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    // Sign In
    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    WebElement buttonSignIn;

    public void clickButtonSignIn() {
        buttonSignIn.click();
    }

    // Navigation Menu: Customer Service
    @FindBy(xpath = "//a[text()='Customer Service']")
    WebElement tabCustomerServices;

    // This method will navigate the user to the Customer Service page
    public void clickTabCustomerService() {
        tabCustomerServices.click();
    }

    // Title "Welcome to Amazon Customer Service"
    @FindBy(xpath = "//h1[@class='fs-heading bolded' and contains(text(), 'Welcome to Amazon Customer Service')]")
    WebElement titleWelcome;

    // This method verifies if the given text is present on the page
    public boolean validateTitleWelcome(String text) {
        return titleWelcome.getText().contains(text);
    }

}