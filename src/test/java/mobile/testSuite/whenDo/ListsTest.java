package mobile.testSuite.whenDo;

import mobile.activities.whendo.AddListScreen;
import mobile.activities.whendo.EditListsScreen;
import mobile.activities.whendo.HamMenuScreen;
import mobile.activities.whendo.MainScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListsTest extends WhendoTestBase {
    MainScreen mainScreen = new MainScreen();
    HamMenuScreen hamenuScreen = new HamMenuScreen();
    EditListsScreen editlistsScreen = new EditListsScreen();
    AddListScreen addListScreen = new AddListScreen();


    @Test
    public void createUpdateDeleteListTest(){
        String name = "Segundo Parcial";
        String updatedName = "Tercer Parcial";

        //Crear Lista
        mainScreen.hamButton.click();
        hamenuScreen.editListsButton.click();
        editlistsScreen.addListButton.click();
        addListScreen.createList(name);
        Assertions.assertEquals(name, editlistsScreen.getList(name).getText(),"Error:  no se creó la lista");

        //Edit Lista
        editlistsScreen.getList(name).click();
        addListScreen.editList(updatedName);
        Assertions.assertEquals(updatedName, editlistsScreen.getList(updatedName).getText(),"Error:  no se editó la lista");

        //Borrar Lista
        editlistsScreen.getList(updatedName).click();
        addListScreen.deleteList();
        Assertions.assertFalse(editlistsScreen.getList(updatedName).isControlDisplayed(),"Error:  no se borro la lista");


    }
}
