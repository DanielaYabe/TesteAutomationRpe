package stepDefinitions;

import config.Configuracao;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.Credenciais;
import utils.Fluxos;
import pages.TransacoesPage;

import static org.testng.AssertJUnit.assertTrue;

public class FluxoTransacoesSteps {

    private WebDriver driver;
    private Fluxos fluxos;
    private TransacoesPage transacoesPage;

    @Given("que clico para incluir nova transacao")
    public void incluirNovaTransacao() {
        driver = Configuracao.iniciarDriver();
        fluxos = new Fluxos(driver);
        fluxos.fazerLogin(Credenciais.ADMIN);
        fluxos.navegarIncluirTransacoes();
        transacoesPage = new TransacoesPage(driver);
    }

    @And("seleciono o cliente {string}")
    public void selecionarCliente(String nome) {
        transacoesPage.selecionarCliente(nome);
    }

    @And("incluo o valor da compra {string}")
    public void incluirValorCompra(String valor) {
        transacoesPage.preencherValorTransacao(valor);
    }

    @When("clico no botão salvar transacoes")
    public void clicarSalvar() {
        transacoesPage.clicarBotaoSalvar();
    }

    @Then("a transacao e realizada com sucesso")
    public void verificarAlertaVendaDeSucesso() {
        assertTrue(transacoesPage.verificarTransacaoRealizadaComSucesso());
        driver.quit();
    }
}
