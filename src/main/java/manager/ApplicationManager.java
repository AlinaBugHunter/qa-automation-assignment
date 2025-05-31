package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import static utils.PropertiesReader.*;

public class ApplicationManager {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {

        ChromeOptions options = new ChromeOptions();

        String userDataDir = getProperty("login.properties", "pathToUsersChrome");
        String profileDir = "Default";

        options.addArguments("--user-data-dir=" + userDataDir);
        options.addArguments("--profile-directory=" + profileDir);

        driver = new ChromeDriver(options);

    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown(Method method) {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}
