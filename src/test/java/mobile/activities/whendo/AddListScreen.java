package mobile.activities.whendo;

import mobile.controls.Button;
import mobile.controls.Label;
import mobile.controls.TextBox;
import org.openqa.selenium.By;

public class AddListScreen {
    public TextBox listName = new TextBox(By.id("com.vrproductiveapps.whendo:id/categoryTitle"));
    public Button colorButton = new Button(By.id("com.vrproductiveapps.whendo:id/color_select11"));
    public Button saveListButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteListButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button checkDeleteButton = new Button(By.id("android:id/button1"));


    public Label createList(String name){
        listName.setText(name);
        colorButton.click();
        saveListButton.click();

    }

    public Label editList(String name){
        listName.clearSetText(name);
        saveListButton.click();
    }

    public Label deleteList(){
        deleteListButton.click();
        checkDeleteButton.click();
    }
}

