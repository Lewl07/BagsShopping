package leo.bagsshopping;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 *
 * @author Leo Ho 
 * Git repo: https://github.com/Lewl07/RestaurantMenu.git
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        ListView<String> bagList = new ListView<String>();
        String[] bags = {"Full Decorative", "Beaded", "Pirate Design",
            "Fringed", "Leather", "Plain"};
        bagList.setItems(FXCollections.observableArrayList(bags));
        
        ComboBox<Integer> cbQuantity = new ComboBox<Integer>();
        
        
        Scene scene = new Scene(bagList);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}