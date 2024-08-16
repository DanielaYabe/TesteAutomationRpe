package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Configuracao {

    private static WebDriver driver;
    public static WebDriver iniciarDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://provaqa.prc.rpe.tech:9080/desafioqa/");
        }
        return driver;
    }

    public static void fecharDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
