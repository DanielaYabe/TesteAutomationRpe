package maps;

import org.openqa.selenium.By;

public class ClienteMap {

    public By campoNome = By.xpath("//input[@name='nome']");
    public By campoCpf = By.xpath("//input[@name='cpf']");
    public By selectStatus = By.xpath("//select[@name='status']");
    public By campoSaldo = By.xpath("//input[@name='saldoCliente']");
    public By btnSalvar = By.xpath("//button[@class='btn btn-primary']");
    public By alertaSucesso = By.xpath("//div[@id='alertMessage' and contains(@class, 'alert-success')]");
}
