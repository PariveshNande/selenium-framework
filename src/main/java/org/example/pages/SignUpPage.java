package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SignUpPage extends BaseTest {
    /**
     * Load and Read Config.Properties File
     */
    public SignUpPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
}
