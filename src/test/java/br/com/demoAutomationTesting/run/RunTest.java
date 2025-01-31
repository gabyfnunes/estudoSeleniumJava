package br.com.demoAutomationTesting.run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
//        tags = "@smoke",
        glue = "br/com/demoAutomationTesting/steps",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
//        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunTest {
}
