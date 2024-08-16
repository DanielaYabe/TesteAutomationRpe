package maps;

import org.openqa.selenium.By;

public class TransacoesMap {

    public By selectCliente = By.xpath("//select[@name='cliente']");
    public By campoValor = By.xpath("//input[@name='valorTransacao']");
    public By btnSalvar = By.xpath("//button[@class='btn btn-primary']");
    public By alertaSucesso = By.xpath("//div[@id='alertMessage']");

}
