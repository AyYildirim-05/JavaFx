package edu.vanier.template;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application implements EventHandler<ActionEvent> {

    Button btn;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!"); // Setting stage
        btn = new Button();
        btn.setText("Say 'Hello World'"); // Setting text on button
        btn.setOnAction(this); // whenever the button is touched, the code to handle it is in this class with the class's handle method

        StackPane root = new StackPane(); // Creating layout
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250)); // You can create the scene separately
        primaryStage.show(); //
    }

    @Override
    public void handle(ActionEvent event) { // Comes with EventHandler. Allows interactive uses with buttons.
        if (event.getSource() == btn) {
            System.out.println("Nice one!"); // allows the printing on the console
        }

    }
}
