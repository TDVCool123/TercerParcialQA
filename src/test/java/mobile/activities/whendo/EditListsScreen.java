package mobile.activities.whendo;

import mobile.controls.Button;
import mobile.controls.Label;
import org.openqa.selenium.By;

public class EditListsScreen {
    public Button addListButton = new Button(By.id("com.vrproductiveapps.whendo:id/addCategoryItem"));
    public Label getList(String name){
        return new Label(By.id("//android.widget.TextView[@text='"+name+"']"));
    }
}
