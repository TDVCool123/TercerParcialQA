package ui.controls;

import ui.session.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Control {
    protected By locator;
    protected WebElement control;

    public Control(By locator){
        this.locator = locator;
    }

    protected void findControl(){
        this.control = Session.getInstance().getBrowser().findElement(this.locator);
    }

    public void click(){
        this.findControl();
        this.control.click();
    }
    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public String getText(){
        this.findControl();
        return control.getText();
    }

    public String value(){
        this.findControl();
        return control.getAttribute("value");
    }
}
