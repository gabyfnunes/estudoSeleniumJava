package br.com.demoAutomationTesting.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@Getter
@Setter
public class Browser {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public void browserUp(String url) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security","--ignore-certificate-errors", "--allow-running-insecure-content");

        driver = new ChromeDriver(options);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6000, MILLISECONDS);

    }

    public void browserDown() {
        driver.quit();
    }

}
