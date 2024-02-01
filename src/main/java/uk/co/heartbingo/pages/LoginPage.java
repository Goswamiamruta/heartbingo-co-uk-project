package uk.co.heartbingo.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(css = ".buttons__login_bar--create-account.bvs-button.is-primary")
    WebElement signUpLink;


    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastName;


    @CacheLookup
    @FindBy(css = "button[type='regpath-button-next']")
    WebElement continueButton;

    public void clickOnSignUpLink(){
        log.info("click on signUpLink " + signUpLink.toString());
        clickOnElement(signUpLink);
    }
    public void enterfirstName(String value) {
        log.info("enterName" + firstName .toString());
        sendTextToElement(firstName , value) ;
    }
    public void enterlastName(String value) {
        log.info("enterName" + lastName .toString());
        sendTextToElement(lastName , value);
    }
    public void clickOnContinueButton(){
        log.info("click on signUpLink " + continueButton .toString());
        clickOnElement(continueButton);
    }

}
