package maps;

import org.openqa.selenium.By;

public class HomeMap {

    public By textoBemVindo = By.xpath("//div/h1[contains(@class, 'page-title')]");
    public By menuQa = By.xpath("//a[span[text()='QA']]");
    public By menuClientes = By.xpath("//a[span[text()='Clientes']]");
    public By menuIncluirClientes = By.xpath("//a[span[text()='Incluir']]");
    public By menuTransacoes = By.xpath("//a[@title='Transações'][span[text()='Transações']]");
    public By menuIncluirTransacoes = By.xpath("//a[@href='/desafioqa/incluirVenda'][span[text()='Incluir']]");

}
