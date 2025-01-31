package br.com.demoAutomationTesting.util;

import br.com.demoAutomationTesting.steps.BaseSteps;
import io.cucumber.java.Before;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Getter
public class Elements extends BaseSteps {

   public static WebElement element(By element) {
        return driver.findElement(element);
    }

    public static WebElement waitVisibility(By element) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

}