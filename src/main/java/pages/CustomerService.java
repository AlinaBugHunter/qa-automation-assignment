package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CustomerService extends BasePage {

    public CustomerService(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    // Tab "Where's my staff" in the Customer Service page
    @FindBy(xpath = "//*[@id='foresight-help-topic-tab-1']")
    WebElement tabWheresMyStaff;

    // This method simulates pressing the DOWN arrow key 10 times to scroll down the page
    // before clicking on the "Where's my staff" tab element
    public void clickTabWheresMyStaff() {
        pause(3);
        Actions actions = new Actions(driver);
        for (int i = 0; i < 15; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
        clickWait(tabWheresMyStaff, 5);
    }

    // Title "All Help Topics"
    @FindBy(xpath = "//h2[@class='fs-heading bolded' and text()='All help topics']")
    WebElement titleAllHelpTopics;

    // This method verifies if the given text is present on the page
    public boolean validateTitleAllHelpTopics(String text) {
        return validateTextPresentInElement(titleAllHelpTopics, text);
    }

    // Tab "Track your package" in the Where's my staff section
    @FindBy(xpath = "//*[@class='fs-match-card-title full' and text()='Track your package']")
    WebElement tabTrackYourPackage;

    public void clickTabTrackYourPackage() {
        clickWait(tabTrackYourPackage, 5);
        windowChanger();
    }

}