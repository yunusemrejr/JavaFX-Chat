package com.example.messengerclient;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
      primaryStage.setTitle("Client");
      primaryStage.setScene(new Scene(root, 478, 396));
      primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}