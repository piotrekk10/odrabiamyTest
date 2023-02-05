package org.odrabiamy.tests;

import org.junit.jupiter.api.Test;
import org.odrabiamy.pageobjects.UltimateqaApp;

public class GetPriceForBasicPlanTests extends BaseSetupSelenium{

    @Test
    public void getBasicPlanPrice(){
        webDriver.get("https://ultimateqa.com/");
        UltimateqaApp ultimateqaApp = new UltimateqaApp(webDriver);
        ultimateqaApp.moveCursorToLearningSection();
        ultimateqaApp.goToAutomationExercisesPage();
        ultimateqaApp.goToFakePricingPage();
        System.out.println(ultimateqaApp.getBasicPlanPriceValue());
    }
}


