package ui.testSuite;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import ui.pages.todoly.LoginSection;
import ui.pages.todoly.MainPage;
import ui.pages.todoly.SettingsSection;

public class UpdateEmailTest extends BaseTestTodoLy {
    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();
    SettingsSection settingsSection = new SettingsSection();
    WebDriver chrome;


    @Test
    public void createUpdateDeleteListTest() throws InterruptedException {
        String fullName = "Chico Layla";
        String email = "skibidisigma@ponmi.com";
        String pwd = "123456789";
        String newEmail = "gigachat@xxx.com";

        //Crear Cuenta
        loginSection.createAccountButton.click();
        loginSection.createAccount(fullName, email, pwd);
        mainPage.settingsButton.click();
        Assertions.assertEquals(email, settingsSection.getEmail(email).getText(), "Error:  no se creó la cuenta");

        //Actualizar Email
        settingsSection.editEmail(newEmail);
        Thread.sleep(3000);
        loginSection.loginButton.click();
        loginSection.login(newEmail, pwd);
        Thread.sleep(5000);
        Alert alert = chrome.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);


        Assertions.assertTrue(mainPage.settingsButton.isControlDisplayed(), "Error:  actualizo el email correctamente");


    }
}