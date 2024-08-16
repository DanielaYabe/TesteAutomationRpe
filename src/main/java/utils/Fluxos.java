package utils;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class Fluxos {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    public Fluxos(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
    }

    public void fazerLogin(Credenciais credenciais) {
        loginPage.preencherLogin(credenciais.getLogin());
        loginPage.preencherSenha(credenciais.getSenha());
        loginPage.clicarSignIn();
    }

    public void navegarIncluirClientes() {
        homePage.clicarMenuQa();
        homePage.clicarMenuClientes();
        homePage.clicarMenuIncluirClientes();
    }

    public void navegarIncluirTransacoes(){
        homePage.clicarMenuQa();
        homePage.clicarMenuTransacoes();
        homePage.clicarMenuIncluirTransacoes();
    }
}
