package edu.vanier.template;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    Button btn;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        btn = new Button();
        btn.setText("Say 'Hello World'");

        /*
        Utilizing lambda expressions to simplify the process
        If we add {} after the arrow, we can do multiple actions
         */
        btn.setOnAction(event -> {
            System.out.println("Lambda expression working...");
            System.out.println("This is good...");
        });


        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
