package org.odrabiamy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class UltimateqaApp{
    private WebDriver driver;

    public UltimateqaApp(WebDriver driver) {
        this.driver = driver;
    }

    private static final By LEARNING_LIST_ITEM = By.xpath("//li[a[text()='Learning']]");
    private static final By AUTOMATION_EXERCISES_LIST_ITEM = By.xpath("//a[text()='Automation Exercises']");
    private static final By FAKE_PRICING_LIST_ITEM = By.xpath("//a[text()='Fake Pricing Page']");
    private static final By BASIC_PRICE_SPAN = By.xpath("//div[h4[text()='Basic']]/following-sibling::div//span[@class='et_pb_sum']");

    public void moveCursorToLearningSection(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(LEARNING_LIST_ITEM)).perform();
    }

    public void goToAutomationExercisesPage() {
        driver.findElement(AUTOMATION_EXERCISES_LIST_ITEM).click();
    }

    public void goToFakePricingPage() {
        driver.findElement(FAKE_PRICING_LIST_ITEM).click();

    }
    public String getBasicPlanPriceValue() {
        return driver.findElement(BASIC_PRICE_SPAN).getAttribute("innerHTML");
    }
}
