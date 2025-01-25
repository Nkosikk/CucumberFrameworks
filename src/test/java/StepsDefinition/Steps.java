package StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Steps extends Base{
    @Given("Iam in login page")
    public void iamInLoginPage() {
        loginPage.verifyThatLoginPageIsDisplayed();
    }

    @And("I enter username (.*)$")
    public void i_enter_username_username(String username) {

    }
    @And("I enter Password (.*)$")
    public void i_enter_password_password(String password) {

    }
    @When("I click login button")
    public void iClickLoginButton() {
    }

    @Then("landing page is displayed")
    public void landing_page_is_displayed() {
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","image");
        }

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }



}
