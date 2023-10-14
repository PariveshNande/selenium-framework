package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DealsPage extends BaseTest {
    /**
     * Load and Read Config.Properties File
     */
    public DealsPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
}
