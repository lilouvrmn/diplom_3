import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecovery {

    private final WebDriver driver;

    public PasswordRecovery(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonLogIn = By.xpath
            (".//a[@class = 'Auth_link__1fOlj'][text() = 'Войти']");

    public PersonalAccount clickLogInButton() {
        if (driver.findElement(buttonLogIn).isDisplayed()) {
            driver.findElement(buttonLogIn).click();
        }
        return new PersonalAccount(driver);
    }
}