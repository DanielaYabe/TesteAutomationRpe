package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginMap {

    public LoginMap(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public By campoLogin = By.xpath("//input[@name='username']");
    public By campoPassword = By.xpath("//input[@name='password']");
    public By btnSignIn = By.xpath("//button[@class='btn btn-primary']");

}
