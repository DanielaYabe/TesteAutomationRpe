package pages;
import org.openqa.selenium.WebDriver;
import maps.HomeMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
        private WebDriver driver;
        private HomeMap homeMap;
        private WebDriverWait wait;

        public HomePage(WebDriver driver) {
            this.driver = driver;
            this.homeMap = new HomeMap();
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public boolean isTextoBemVindoPresente() {
            return driver.findElement(homeMap.textoBemVindo).isDisplayed();
        }

        public void clicarMenuQa() {
            WebElement menuQa = wait.until(ExpectedConditions.elementToBeClickable(homeMap.menuQa));
            menuQa.click();
        }

        public void clicarMenuClientes() {
            driver.findElement(homeMap.menuClientes).click();
        }

        public void clicarMenuIncluirClientes() {
            WebElement menuIncluirClientes = wait.until(ExpectedConditions.elementToBeClickable(homeMap.menuIncluirClientes));
            menuIncluirClientes.click();
        }

        public void clicarMenuTransacoes() {
            driver.findElement(homeMap.menuTransacoes).click();
        }

        public void clicarMenuIncluirTransacoes() {
            WebElement menuIncluirTransacoes = wait.until(ExpectedConditions.elementToBeClickable(homeMap.menuIncluirTransacoes));
            menuIncluirTransacoes.click();
        }
}
