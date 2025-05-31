package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TrackYourOrdersPage extends BasePage {

    public TrackYourOrdersPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//h1[text()=' Tracking your package']")
    WebElement titleTrackingYourPackage;

    public boolean validateTitleTrackingYourPackage(String text) {
        return validateTextPresentInElement(titleTrackingYourPackage, text);
    }

    // Link to the "Your Orders" page on the "Track Your Orders" page
    @FindBy(xpath = "//*[@href='https://www.amazon.com/gp/css/order-history' and text()='Your Orders']")
    WebElement linkYourOrders;

    public void openLinkYourOrders() {
        try {
            linkYourOrders.click();
        } catch (Exception e) {
            System.err.println(e.getMessage() + " > openLinkYourOrders");
        }
        windowChanger();
    }

}