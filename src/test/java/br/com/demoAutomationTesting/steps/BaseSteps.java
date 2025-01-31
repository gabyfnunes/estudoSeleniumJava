package br.com.demoAutomationTesting.steps;

import br.com.demoAutomationTesting.util.Browser;
import br.com.demoAutomationTesting.util.Elements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

public class BaseSteps extends Browser {

    @Before
    public void abrirNavegador(){
        browserUp("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @After
    public void fecharNavegador(){
        browserDown();
    }
}
