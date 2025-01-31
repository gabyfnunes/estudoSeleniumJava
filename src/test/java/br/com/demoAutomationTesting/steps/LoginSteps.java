package br.com.demoAutomationTesting.steps;

import br.com.demoAutomationTesting.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Dado("que estou na pagina de login")
    public void paginaDeLogin() {
        Assert.assertTrue(loginPage.validarUrlAtual().contains("/auth/login"));
    }

    @E("preencho corretamente o campo username")
    public void preenchoCorretamenteUserName() {
        loginPage.preenchoCorretamenteUsername("Admin");
    }

    @E("preencho incorretamente o campo username")
    public void preenchoIncorretamenteUserName() {
        loginPage.preenchoCorretamenteUsername("Erro");
    }

    @E("não preencho o campo username")
    public void naoPreenchoUserName() {
        loginPage.usernameVazio("");
    }

    @E("preencho corretamente o campo password")
    public void preenchoCorretamentePassword() {
        loginPage.preenchoCorretamentePassword("admin123");
    }

    @Quando("clico em Login")
    public void clicoEmLogin() {
        loginPage.clickLogin();
    }

    @Então("devo ser redirecionado para o dashboard")
    public void dashboardPage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(loginPage.validarUrlAtual().contains("/dashboard/index"));
    }

    @Então("devo validar mensagem de erro credenciais invalidas")
    public void mensagemDeErroInvalidCredentials() {
       Assert.assertEquals("Invalid credentials", loginPage.validarMensagemDeErroInvalidCredentials());
    }

    @Então("devo validar mensagem de erro no username required")
    public void mensagemDeErroInvalidUsername() {
        Assert.assertEquals("Required", loginPage.validarMensagemDeErroNoUsernameRequired());
    }



}
