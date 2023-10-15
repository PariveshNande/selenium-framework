package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseTest {
    /**
     * Load and Read Config.Properties File
     */
    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    WebElement loginBtn;

    @FindBy(xpath = "//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")
    WebElement googleSignInBtn;

    public void performLoginOpration() throws InterruptedException {
        userName.click();
        userName.sendKeys("pariveshnande123q@gmail.com");
        password.click();
        password.sendKeys("Welcome@123");
        loginBtn.click();
    }
}
