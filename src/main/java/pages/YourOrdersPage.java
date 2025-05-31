package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class YourOrdersPage extends BasePage {

    public YourOrdersPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//h1[text()='Your Orders']")
    WebElement titleYourOrders;

    public boolean validateTitleYourOrders(String text) {
        return validateTextPresentInElement(titleYourOrders, text);
    }

}
