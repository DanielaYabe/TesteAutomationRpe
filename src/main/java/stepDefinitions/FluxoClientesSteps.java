package stepDefinitions;

import config.Configuracao;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.ClientePage;
import pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.Credenciais;
import utils.Fluxos;

import static org.testng.Assert.assertTrue;

public class FluxoClientesSteps {

    private WebDriver driver;
    private ClientePage clientePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private Fluxos fluxos;

    @Given("que clico para incluir novos clientes")
    public void isHome() {
        driver = Configuracao.iniciarDriver();
        fluxos = new Fluxos(driver);
        fluxos.fazerLogin(Credenciais.ADMIN);
        fluxos.navegarIncluirClientes();
        clientePage = new ClientePage(driver);
    }

    @And("incluo o nome {string}")
    public void informarNome(String nome) {
        clientePage.preencherNome(nome);
    }

    @And("incluo o cpf {string}")
    public void informarCpf(String cpf) {
        clientePage.preencherCpf(cpf);
    }

    @And("incluo o status {string}")
    public void selecionarStatus(String status) {
        clientePage.selecionarStatus(status);
    }

    @And("incluo o saldo {string}")
    public void informarSaldo(String saldo) {
        clientePage.preencherSaldo(saldo);
    }

    @When("clico no botão salvar clientes")
    public void clicarSalvar() {
        clientePage.clicarSalvarCliente();
    }

    @Then("o cliente e salvo com sucesso")
    public void verificarAlertaInclusaoClienteSucesso() {
        boolean sucesso = clientePage.isAlertaVisivel();
        assertTrue(sucesso, "O alerta de sucesso não foi exibido ou o texto está incorreto.");
        Configuracao.fecharDriver();
    }

}
