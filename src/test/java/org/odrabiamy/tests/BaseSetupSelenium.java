package org.odrabiamy.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class BaseSetupSelenium {

    WebDriver webDriver;

    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().version("109.0.5414.74/chromedriver_win32.zip").setup();
    }

    @BeforeEach
    void setup() {
        webDriver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        webDriver.quit();
    }
}