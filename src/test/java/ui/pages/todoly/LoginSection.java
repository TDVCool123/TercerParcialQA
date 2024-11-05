package ui.pages.todoly;

import ui.controls.Button;
import ui.controls.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));

    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public  Button entryButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));

    public Button createAccountButton = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));
    public TextBox fullName = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox email = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwd = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button agreeButton = new Button(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button singupButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
    public void login(String email, String pwd){
        this.emailTxtBox.setText(email);
        this.pwdTxtBox.setText(pwd);
        this.entryButton.click();
    }

    public void createAccount(String fullName, String email,String pwd){
        this.fullName.setText(fullName);
        this.email.setText(email);
        this.pwd.setText(pwd);
        agreeButton.click();
        singupButton.click();

    }
}