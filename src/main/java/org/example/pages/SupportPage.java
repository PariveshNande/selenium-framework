package org.example.pages;

import org.example.base.BaseTest;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SupportPage extends BaseTest {
    public SupportPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
}
