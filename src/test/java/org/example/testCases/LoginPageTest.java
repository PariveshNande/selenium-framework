package org.example.testCases;

import org.example.base.BaseTest;
import org.example.pages.LandingPage;
import org.example.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    LandingPage landingPage;

    public LoginPageTest() throws IOException {
    }

    @BeforeTest
    public void createAndInitialize() throws IOException {
        browserInvocation();
        landingPage = new LandingPage();
    }


    @Test
    public void userLoginTest() throws IOException, InterruptedException {
        landingPage.navigateToLoginPage();
        Thread.sleep(3000);
        loginPage = new LoginPage();
        loginPage.userLogin();
       /*
        try {
           loginPage.userLogin();
       }
       catch(Exception e){
           System.out.println(e.getStackTrace());
       }
        */
    }

    @Test
    public void buttonsDisplayed() throws IOException {
        landingPage.navigateToLoginPage();
        System.out.println(loginPage.verifyLoginPageTitle());
        loginPage.verifyLoginPageTitle();
        System.out.println(loginPage.verifyTheForgetPasswordBtn());
    }
}

