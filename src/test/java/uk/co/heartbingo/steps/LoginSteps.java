package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import uk.co.heartbingo.pages.LoginPage;

import static uk.co.heartbingo.browserfactory.ManageBrowser.driver;

public class LoginSteps {
    @Given("I open Url")
    public void iOpenUrl() {
    }

    @When("I accept cookies")
    public void iAcceptCookies() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.id("onetrust-accept-btn-handler")));
    }
    @Then("click on Signup button")
    public void clickOnSignupButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".buttons__login_bar--create-account.bvs-button.is-primary")));
    }
    @Then("Enter firstname {string}")
    public void enterFirstname(String firstName) {
        new LoginPage().enterfirstName(firstName);
    }

    @And("Enter lastName {string}")
    public void enterLastName(String lastName) {
        new LoginPage().enterlastName(lastName );
    }


    @And("Click on continue button")
    public void clickOnContinueButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("button[type='regpath-button-next']")));

    }



}