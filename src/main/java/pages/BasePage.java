package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BasePage {

    static WebDriver driver;

    public static void setDriver(WebDriver wd) {
        driver = wd;
    }

    public void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // This method waits for an element to become clickable and then clicks it.
    public void clickWait(WebElement element, int time) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(time))
                    .until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            System.out.println("Created Exception > clickWait()");
            System.out.println(e.getMessage());
        }
    }

    // This method verifies if the given text is present on the page
    public boolean validateTextPresentInElement(WebElement element, String expectedText) {
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }

    public void windowChanger() {
        // Save the current window handle of the main window
        String mainWindowHandle = driver.getWindowHandle();

        // Wait for a new window to open and store all the window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        String newWindowHandle = null;

        // Find the new window's handle (that is not the main window)
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(mainWindowHandle)) {
                newWindowHandle = windowHandle;  // Save the new window's handle
                break;
            }
        }

        if (newWindowHandle != null) {
            // Switch to the new window
            driver.switchTo().window(newWindowHandle);

            // Close the main (previous) window
            driver.switchTo().window(mainWindowHandle);
            driver.close();

            // Switch back to the new window (after closing the old one)
            driver.switchTo().window(newWindowHandle);
        }
    }

}