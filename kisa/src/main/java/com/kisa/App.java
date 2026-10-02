package com.kisa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(new Label("Hello, Kisa!"));
        stage.setTitle("Kisa");
        stage.setScene(new Scene(root, 360, 240));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}