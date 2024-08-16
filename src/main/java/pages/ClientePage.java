package pages;

import maps.ClienteMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClientePage {

    WebDriver driver;
    ClienteMap clienteMap;
    private WebDriverWait wait;

    public ClientePage(WebDriver driver) {
        this.driver = driver;
        clienteMap = new ClienteMap();
        PageFactory.initElements(driver, clienteMap);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void preencherNome(String nome) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clienteMap.campoNome));
        driver.findElement(clienteMap.campoNome).sendKeys(nome);
    }

    public void preencherCpf(String cpf) {
        driver.findElement(clienteMap.campoCpf).sendKeys(cpf);
    }

    public void selecionarStatus(String status) {
        Select select = new Select(driver.findElement(clienteMap.selectStatus));
        select.selectByVisibleText(status);
    }

    public void preencherSaldo(String saldo) {
        driver.findElement(clienteMap.campoSaldo).sendKeys(saldo);
    }

    public void clicarSalvarCliente() {
        driver.findElement(clienteMap.btnSalvar).click();
    }

    public boolean isAlertaVisivel() {
        WebElement alerta = wait.until(ExpectedConditions.visibilityOfElementLocated(clienteMap.alertaSucesso));
        return alerta.isDisplayed() && alerta.getText().contains("Cliente salvo com sucesso");
    }
}
