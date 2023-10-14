package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends BaseTest {
    /**
     * Load and Read Config.Properties File
     */
    public HomePage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
}
