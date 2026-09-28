package leo.bagsshopping;

import javafx.application.Application;
import javafx.scene.Scene;
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
        ListView lv = new ListView();
        
        Scene scene = new Scene(lv);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}