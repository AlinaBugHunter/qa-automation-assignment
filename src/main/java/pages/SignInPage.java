package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static utils.PropertiesReader.*;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//*[@id='ap_email_login']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement buttonContinue;

    @FindBy(xpath = "//input[@type='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement buttonSignIn;

    public void fillSignInForm() {
        inputEmail.sendKeys(getProperty("login.properties", "email"));
        buttonContinue.click();
        pause(5);
        inputPassword.sendKeys(getProperty("login.properties", "password"));
        buttonSignIn.click();
    }

    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    WebElement menuAccount;

    @FindBy(xpath = "//span[@class='nav-text' and text()='Sign Out']")
    WebElement buttonSignOut;

    public boolean hoverAndValidateSignOut(String text) {
        Actions actions = new Actions(driver); // Create an Actions object for mouse interactions
        actions.moveToElement(menuAccount).perform(); // Hover over the account menu element
        return validateTextPresentInElement(buttonSignOut, text);
    }

}
