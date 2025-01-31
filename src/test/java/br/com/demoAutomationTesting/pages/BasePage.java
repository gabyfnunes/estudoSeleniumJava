package br.com.demoAutomationTesting.pages;

import br.com.demoAutomationTesting.util.Elements;
import org.openqa.selenium.By;




public class BasePage extends Elements {
//    protected WebDriver driver;
//
//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        Elements.init(driver); // 🔹 Inicializa o WebDriverWait corretamente
//    }

    public static void click(By by){
        element(by);
        waitVisibility(by).click();
    }


    public static void clear(By by){
        element(by);
        waitVisibility(by).clear();
    }

    public static void sendKeys(By by, String texto){
        element(by);
        waitVisibility(by).sendKeys(texto);
    }

    public static String getText(By by){
        element(by);
        return waitVisibility(by).getText();
    }

    public static String getAttributeInnerText(By by){
        element(by);
        return waitVisibility(by).getAttribute("innerText");
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}