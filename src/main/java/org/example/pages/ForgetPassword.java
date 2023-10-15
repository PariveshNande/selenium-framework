package org.example.pages;

import org.example.actions.ActionDriver;
import org.example.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ForgetPassword extends BaseTest {

    ActionDriver actionDriver = new ActionDriver();
    LoginPage loginPage;

    public ForgetPassword() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="/html/body/div/div/img")
    WebElement forgetPasswordLogo;

    @FindBy(xpath="//div[@class='field'][2]")
    WebElement emailField;

    @FindBy(xpath="//div[@class='field'][3]")
    WebElement resetPasswordBtn;

    @FindBy(xpath="/html/body/div/div/a")
    WebElement loginBtn;

    @FindBy(xpath="/html/body/div/div/div")
    WebElement thankYouMsg;

    public String verifyForgetPasswordPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyTheLogo(){
        return actionDriver.isDisplayed(driver, forgetPasswordLogo);
    }

    public void verifyTheForgetPasswordFunctionality(){
        emailField.clear();
        actionDriver.type(emailField, properties.getProperty("userEmail"));
        actionDriver.click(driver, resetPasswordBtn);
    }

    public String veifyTheThankYouMsg(){
       return thankYouMsg.getText();
    }

    public LoginPage verifyTheLoginBtnOnForgetPasswordPage() throws IOException {
        loginPage = new LoginPage();
        actionDriver.click(driver, loginBtn);
        return new LoginPage();
    }
}
