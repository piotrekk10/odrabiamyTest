package org.odrabiamy.steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSteps {
    public static void main(String[] args) {
        // Ustawienie ścieżki do pliku wykonywalnego ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkaniewski3\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Utworzenie nowego obiektu ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Otwarcie strony "https://ultimateqa.com"
        driver.get("https://ultimateqa.com");

        // Kliknięcie w zakładkę "Automation Exercise"
        driver.findElement(By.xpath("//a[text()='Automation Exercises']")).click();

        // Kliknięcie w link "Fake Pricing Page"
        driver.findElement(By.xpath("//a[text()='Fake Pricing Page']")).click();

        // Pobranie ceny za pakiet basic
        //WebElement basicPriceElement = driver.findElement(By.xpath("//div[text()='Basic']/following-sibling::td[1]"));
        WebElement basicPriceElement = driver.findElement(By.xpath("//div[h4[text()='Basic']]/following-sibling::div//span[@class='et_pb_sum']"));
        String basicPrice = basicPriceElement.getText();

        // Wyświetlenie ceny za pakiet basic
        System.out.println("Cena za pakiet basic: " + basicPriceElement.getAttribute("innerHTML"));

        // Zakończenie pracy przeglądarki
        driver.quit();
    }
}

