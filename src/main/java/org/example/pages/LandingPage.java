package org.example.pages;

import org.example.actions.ActionDriver;
import org.example.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LandingPage extends BaseTest {
    ActionDriver actionDriver = new ActionDriver();
    /**
     * Page Factory for Landing Page
     */

    @FindBy(xpath = "//span[normalize-space()='Log In']")
    WebElement login;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUp;

    @FindBy(xpath = "//a[normalize-space()='About']")
    WebElement about;

    @FindBy(xpath = "//a[normalize-space()='Compare']")
    WebElement compare;

    @FindBy(xpath = "//a[normalize-space()='Pricing']")
    WebElement pricing;

    @FindBy(xpath = "//a[normalize-space()='Support']")
    WebElement support;

    @FindBy(xpath = "//a[normalize-space()='CRM']")
    WebElement crm;

    @FindBy(xpath = "//a[normalize-space()='VCM']")
    WebElement vcm;

    @FindBy(xpath = "//font[normalize-space()='crm']")
    WebElement crmLogo;

    String loginPageTitle = null;
    String signUpPageTitle = null;
    String aboutPageTitle = null;

    /**
     * Init Page Objects
     */
    public LandingPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    /**
     * Actions
     *
     * @return
     */

    public String validateLandingPageTitle() {
        return driver.getTitle();
    }

    public boolean validateCRMImage() {
        crmLogo.isDisplayed();
        return true;
    }

    public String navigateToLoginPage() {
        if (login.isDisplayed() && login.isEnabled()) {
            login.click();
            loginPageTitle = driver.getTitle();
        } else {
            System.out.println("Login Button Disabled");
        }
        return loginPageTitle;
    }

    public String navigateToSignUpPage() {
        if (signUp.isDisplayed() && signUp.isEnabled()) {
            signUp.click();
            signUpPageTitle = driver.getTitle();
        } else {
            System.out.println("SignUp Button Disabled");
        }
        return signUpPageTitle;
    }

    public String navigateToAbout() {
        if (about.isDisplayed() && about.isEnabled()) {
            about.click();
            aboutPageTitle = driver.getTitle();
        } else {
            System.out.println("About link is not working");
        }
        return aboutPageTitle;
    }

    public void navigateToCompare() {
        compare.click();
    }

    public void navigateToPricing() {
        pricing.click();
    }

    public void navigateToSupport() {
        support.click();
    }

    public void navigateToCRM() {
        crm.click();
    }

    public void vcm() {
        vcm.click();
    }
}
