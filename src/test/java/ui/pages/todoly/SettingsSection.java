package ui.pages.todoly;


import ui.controls.Button;
import ui.controls.Icon;
import ui.controls.Label;
import ui.controls.TextBox;
import org.openqa.selenium.By;
public class SettingsSection {
    public Button okButton = new Button(By.xpath("//button/span[text()='Ok']"));
    public TextBox emailInput = new TextBox(By.id("EmailInput"));

    public String getEmail(String email){
        return emailInput.value();

    }

    public void editEmail(String email){
        emailInput.clearSetText(email);
        okButton.click();
    }
}
