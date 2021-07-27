package com.merive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RRC extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/rrc.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("RRC");
        stage.getIcons().add(new Image(getClass().getResource("icons/rrc.png").toString()));
        stage.setScene(new Scene(root, 600, 455));
        stage.setResizable(false);
        stage.show();
    }
}
