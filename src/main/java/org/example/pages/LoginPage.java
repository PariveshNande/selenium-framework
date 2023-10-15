package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseTest {
    /**
     * Page Factory for Login Page
     */
    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement emailField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(xpath = "")
    WebElement emailField;

}
