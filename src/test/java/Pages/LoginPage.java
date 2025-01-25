package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "actual xpath")
    WebElement loginPageTitle_xpath;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyThatLoginPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginPageTitle_xpath));
    }
}
