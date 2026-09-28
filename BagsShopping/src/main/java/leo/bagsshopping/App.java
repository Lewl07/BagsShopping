package leo.bagsshopping;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 *
 * @author Leo Ho 
 * Git repo: https://github.com/Lewl07/BagsShopping.git
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        ListView<String> bagList = new ListView<String>();
        String[] bags = {"Full Decorative", "Beaded", "Pirate Design",
            "Fringed", "Leather", "Plain"};
        bagList.setItems(FXCollections.observableArrayList(bags));
        
        ComboBox<Integer> cbQuantity = new ComboBox<Integer>();
        cbQuantity.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        ToggleGroup group = new ToggleGroup();
        
        RadioButton smallBtn = new RadioButton("Small");
        smallBtn.setToggleGroup(group);
        
        RadioButton mediumBtn = new RadioButton("Medium");
        mediumBtn.setToggleGroup(group);
        
        RadioButton largeBtn = new RadioButton("Large");
        largeBtn.setToggleGroup(group);
        
        Button orderBtn = new Button("Order");
        Label selection = new Label();
        orderBtn.setOnAction(e -> {
            
            selection.setText("You chose");
        });
        
        Button clearBtn = new Button("Clear");
        clearBtn.setOnAction(e -> {
            selection.setText("");
        });
        
        VBox root = new VBox();
        HBox hbox = new HBox(10, smallBtn, mediumBtn, largeBtn, cbQuantity);
        HBox selectionHb = new HBox(10, orderBtn, clearBtn, selection);
        
        VBox vbox = new VBox(bagList);
        root.getChildren().addAll(hbox, selectionHb, vbox);

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}