package com.example.reversestringapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReverseStringApp extends Application {
    public static void main(String[] args) {

        launch();
    }

    public static String reverseString(String string){
        String input = string;
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ReverseStringApp.class.getResource("reversestringapp-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Reverse String App");
        stage.setScene(scene);
        stage.show();
    }


}