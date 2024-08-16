package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import maps.TransacoesMap;

import java.time.Duration;

public class TransacoesPage {

    private WebDriver driver;
    private TransacoesMap transacoesMap;
    private WebDriverWait wait;

    public TransacoesPage(WebDriver driver) {
        this.driver = driver;
        this.transacoesMap = new TransacoesMap();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selecionarCliente(String cliente) {
        Select select = new Select(driver.findElement(transacoesMap.selectCliente));
        select.selectByVisibleText(cliente);
    }

    public void preencherValorTransacao(String valor) {
        WebElement valorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(transacoesMap.campoValor));
        valorElement.clear();
        valorElement.sendKeys(valor);
    }

    public void clicarBotaoSalvar() {
        driver.findElement(transacoesMap.btnSalvar).click();
    }

    public boolean verificarTransacaoRealizadaComSucesso() {
        WebElement alerta = wait.until(ExpectedConditions.visibilityOfElementLocated(transacoesMap.alertaSucesso));
        return alerta.isDisplayed() && alerta.getText().contains("Venda realizada com sucesso");
    }
}
