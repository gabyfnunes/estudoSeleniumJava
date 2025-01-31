package br.com.demoAutomationTesting.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By username = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input");
    private static final By password = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input");
    private static final By btnLogin = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button");
    private static final By btnForgotYourPassword = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.orangehrm-login-forgot > p");
    private static final By msgErroCredentials = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div.oxd-alert.oxd-alert--error > div.oxd-alert-content.oxd-alert-content--error");
    private static final By msgUsernameRequired = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > span");


    @Step("preencho corretamente o campo username")
    public void preenchoCorretamenteUsername(String usuario) {sendKeys(username, usuario);}

    @Step("preencho corretamente o campo password")
    public void preenchoCorretamentePassword(String senha) {sendKeys(password, senha);}

    @Step("clico em Login")
    public void clickLogin(){click(btnLogin);}

    @Step("devo ser redirecionado para o dashboard")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }

    @Step("preencho incorretamente o campo username")
    public void preenchoIncorretamenteUsername(String usuario) {sendKeys(username, usuario);}

    @Step("devo validar mensagem de erro credenciais invalidas")
    public String validarMensagemDeErroInvalidCredentials() {
        return getAttributeInnerText(msgErroCredentials);
    }

    @Step("não preencho o campo username")
    public void usernameVazio(String usuario) {sendKeys(username, usuario);}

    @Step("devo validar mensagem de erro no username required")
    public String validarMensagemDeErroNoUsernameRequired() {
        return getAttributeInnerText(msgUsernameRequired);
    }


}
