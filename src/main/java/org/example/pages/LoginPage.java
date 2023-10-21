package org.example.pages;

import org.example.actions.ActionDriver;
import org.example.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseTest {

    ActionDriver actionDriver = new ActionDriver();
    ForgetPassword forgetPassword;
    SignUpPage signUpPage;
    /**
     * Page Factory for Login Page
     */
    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
/*
    @FindBy(name = "email")
    WebElement emailField;

 */


    @FindBy(css = "input[placeholder='Email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id='ui']/div/div/form/div/div[3]")
    WebElement loginBtn;

    @FindBy(xpath="//*[@id='container']/div/div[2]")
    WebElement googleLoginBtn;

    @FindBy(xpath="//*[@id='ui']/div/div/div[2]/a")
    WebElement forgetPasswordBtn;

    @FindBy(xpath="//*[@id='ui']/div/div/div[3]/a")
    WebElement signUpBtnOnLoginPage;

    public String verifyLoginPageTitle(){
        return driver.getTitle();
    }

    public void userLogin() throws InterruptedException {
        emailField.click();
        emailField.sendKeys("pariveshnande123q@gmail.com");
        Thread.sleep(3000);
       // passwordField.clear();
        //passwordField.sendKeys(properties.getProperty("password"));
        // actionDriver.click(driver, loginBtn);
    }

    public boolean verifyTheSocialLoginBtn(){
        return actionDriver.isDisplayed(driver, googleLoginBtn);
    }

    public boolean verifyTheForgetpasswordBtn(){
        return actionDriver.isDisplayed(driver, forgetPasswordBtn);
    }

    public boolean verifyTheSignUpBtn(){
        return actionDriver.isDisplayed(driver, signUpBtnOnLoginPage);
    }

    public ForgetPassword verifyTheForgetPasswordBtn() throws IOException {
        forgetPassword = new ForgetPassword();
//        actionDriver.click(driver, forgetPasswordBtn);
        forgetPasswordBtn.click();
        return new ForgetPassword();
    }

    public SignUpPage verifyTheFunctionalityOfSignUpBtn() throws IOException {
        signUpPage = new SignUpPage();
        actionDriver.click(driver, signUpBtnOnLoginPage);
        return new SignUpPage();
    }

}
