package org.example.testCases;

import org.example.base.BaseTest;
import org.example.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.example.TestConstants.*;

public class LandingPageTest extends BaseTest {

    LandingPage landingPage;

    public LandingPageTest() throws IOException {
    }

    @BeforeMethod
    public void createAndInitialize() throws IOException {
        browserInvocation();
        landingPage = new LandingPage();
    }

    @Test(description = "This Test validates title of the web application", enabled = true)
    public void titleValidationTest() {
        String pageTitle = landingPage.validateLandingPageTitle();
        Assert.assertEquals(pageTitle, _pageTitle);
    }

    @Test(description = "Validate CRM logo visibility on screen", enabled = true)
    public void crmLogoValidationTest() {
        boolean flag = landingPage.validateCRMImage();
        Assert.assertTrue(flag);

    }

    @Test(description = "Validate login btn is enabled and on clicking in page navigates to login page and validated title of the page", enabled = true)
    public void navigateToLoginPage() {
        String loginPageTitle = landingPage.navigateToLoginPage();
        Assert.assertEquals(loginPageTitle, _loginPageTitle);
    }

    @Test(description = "Validate SignUp btn is enabled and on clicking in page navigates to login page and validated title of the page", enabled = true)
    public void navigateToSignUpPage() {
        String signUpPageTitle = landingPage.navigateToSignUpPage();
        Assert.assertEquals(signUpPageTitle, _signUpPageTitle);
    }

    @Test(description = "Validate about link is enabled and on clicking in page navigates to about page and validated title of the page", enabled = true)
    public void navigateToAboutPage() {
        String aboutPageTitle = landingPage.navigateToAbout();
        Assert.assertEquals(aboutPageTitle, _aboutPageTitle);
    }

    @Test(description = "", enabled = true)
    public void navigateToComparePage() throws IOException {
        landingPage.navigateToCompare();
    }

    @Test(description = "", enabled = true)
    public void navigateToPricingPage() throws IOException {
        landingPage.navigateToPricing();
    }

    @Test(description = "", enabled = true)
    public void navigateToSupportPage() throws IOException {
        landingPage.navigateToSupport();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
