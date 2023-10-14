package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ContactsPage extends BaseTest {
    /**
     * Load and Read Config.Properties File
     */
    public ContactsPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
}
