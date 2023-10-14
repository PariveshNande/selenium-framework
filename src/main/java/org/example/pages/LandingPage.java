package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LandingPage extends BaseTest {
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

    public void navigateToLoginPage() {
        login.click();
    }

    public void navigateToSignUpPage() {
        signUp.click();
    }

    public void navigateToAbout() {
        about.click();
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
