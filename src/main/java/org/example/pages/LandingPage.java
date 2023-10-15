package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.util.TestUtil.IMPLICIT_WAIT;

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

    String loginPageTitle = null;
    String signUpPageTitle = null;
    String aboutPageTitle = null;
    String comparePageTitle = null;
    String pricingPageTitle = null;
    String supportPageTitle = null;
    String supportPageUrl = null;
    List<String> supportPageData = null;

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
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        crmLogo.isDisplayed();
        return true;
    }

    public String navigateToLoginPage() throws InterruptedException {
        if (login.isDisplayed() && login.isEnabled()) {
            login.click();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            loginPageTitle = driver.getTitle();
        } else {
            System.out.println("Login Button Disabled");
        }
        return loginPageTitle;
    }

    public String navigateToSignUpPage() {
        if (signUp.isDisplayed() && signUp.isEnabled()) {
            signUp.click();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            signUpPageTitle = driver.getTitle();
        } else {
            System.out.println("SignUp Button Disabled");
        }
        return signUpPageTitle;
    }

    public String navigateToAbout() {
        if (about.isDisplayed() && about.isEnabled()) {
            about.click();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            aboutPageTitle = driver.getTitle();
        } else {
            System.out.println("About link is not working");
        }
        return aboutPageTitle;
    }

    public String navigateToCompare() {
        if (compare.isDisplayed() && compare.isEnabled()) {
            compare.click();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            comparePageTitle = driver.getTitle();
        } else {
            System.out.println("About link is not working");
        }
        return aboutPageTitle;
    }

    public String navigateToPricing() {
        if (pricing.isDisplayed() && pricing.isEnabled()) {
            pricing.click();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            pricingPageTitle = driver.getTitle();
        } else {
            System.out.println("Pricing link is not working");
        }
        return pricingPageTitle;
    }

    public List<String> navigateToSupport() {
        if (support.isDisplayed() && support.isEnabled()) {
            support.click();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            supportPageTitle = driver.getTitle();
            supportPageUrl = driver.getCurrentUrl();

            supportPageData = new ArrayList<>();
            supportPageData.add(supportPageTitle);
            supportPageData.add(supportPageUrl);
        } else {
            System.out.println("Support link is not working");
        }
        return supportPageData;
    }


    public void navigateToCRM() {
        crm.click();
    }

    public void vcm() {
        vcm.click();
    }
}
