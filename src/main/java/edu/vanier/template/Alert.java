package edu.vanier.template;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.control.Label;

public class Alert {

    public static void display(String title, String message) { // The method is void as to avoid creating objects
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); // block input event with other user windows until this window is solved first
        window.setTitle(title);
        window.setMinWidth(240);

        Label label = new Label();
        label.setText(message);

        Button btnClose =  new Button("Close window");
        btnClose.setOnAction(event -> window.close());

        VBox layout = new VBox();
        layout.getChildren().addAll(label, btnClose);
        layout.setAlignment(Pos.CENTER); // align layout in the middle

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); // this makes so that the user has to close the window before going back
    }
}
