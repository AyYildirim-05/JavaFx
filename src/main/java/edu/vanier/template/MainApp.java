package edu.vanier.template;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    Stage window;
    Scene scene1, scene2;
    Button btn;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        // Button 1
        Label label = new Label("Welcome to scene 1!");
        Button button1 = new Button("Go to scene 2?");
        button1.setOnAction(e -> window.setScene(scene2)); // Code to switch between two scenes

        // layout 1
        VBox layout1 = new VBox(20); // Will space the elements by 20 pixels.
        layout1.getChildren().addAll(label, button1); // Use .add() if it is a single element
        scene1 = new Scene(layout1, 300, 300); // Create a scene based on the layout we designed

        // Button 2
        Button button2 = new Button("This scene sucks go back to scene 1?");
        button2.setOnAction(e -> window.setScene(scene1));

        // layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 600); // This line is the one that creates the scene with our layout

        window.setScene(scene1); // this code makes so that we have to start with scene one
        window.setTitle("Small Attempt...");
        window.show();
    }
}
