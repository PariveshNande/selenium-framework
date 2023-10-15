package org.example.testCases;

import org.example.base.BaseTest;
import org.example.pages.LandingPage;
import org.example.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest {

    LandingPage landingPage;
    LoginPage loginPage;

    /**
     * Load and Read Config.Properties File
     */
    public LoginPageTest() throws IOException {
    }

    @BeforeMethod
    public void createAndInitialize() throws IOException {
        browserInvocation();
        loginPage = new LoginPage();

    }

    @Test
    public void performLogin() throws IOException, InterruptedException {
        landingPage = new LandingPage();

        landingPage.navigateToLoginPage();
        loginPage.performLoginOpration();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
