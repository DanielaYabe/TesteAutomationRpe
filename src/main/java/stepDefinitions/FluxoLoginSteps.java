package stepDefinitions;

import config.Configuracao;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FluxoLoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Given("que estou na página de login")
    public void paginaLogin() {
        driver = Configuracao.iniciarDriver();
        loginPage = new LoginPage(driver);
    }

    @And("incluo o usuário {string}")
    public void incluirUser(String user) {
        loginPage.preencherLogin(user);
    }

    @And("incluo a senha {string}")
    public void incluirSenha(String password) {
        loginPage.preencherSenha(password);
    }

    @When("clico no botão sign in")
    public void clicarBotaoSignIn() {
        loginPage.clicarSignIn();
    }

    @Then("sou direcionada para a página home")
    public void paginaHome() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isTextoBemVindoPresente(), "O texto 'Bem vindo ao Desafio' não está presente na página.");
        Configuracao.fecharDriver();
    }
}
