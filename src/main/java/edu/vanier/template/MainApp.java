package edu.vanier.template;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Scanner;

public class MainApp extends Application {

    Stage window;
    Button btn;
    Scene scene;
    Scanner scanner;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Alert Boxes");

        btn = new Button("Click me?");
        btn.setOnAction(event -> {Alert.display("Hello", "No message!");
        });


        StackPane layout = new StackPane();
        layout.getChildren().add(btn);

        scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();

    }
}
