package pages;

import maps.LoginMap;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private LoginMap loginMap;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.loginMap = new LoginMap(driver);
    }

    public void preencherLogin(String login) {
        driver.findElement(loginMap.campoLogin).sendKeys(login);
    }

    public void preencherSenha(String senha) {
        driver.findElement(loginMap.campoPassword).sendKeys(senha);
    }

    public void clicarSignIn() {
        driver.findElement(loginMap.btnSignIn).click();
    }
}
