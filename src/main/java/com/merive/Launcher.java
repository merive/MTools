package com.merive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/launcher.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);

        Scene scene = new Scene(root);

        stage.setTitle("MTools");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResource("icons/launcher.png").toString()));
        stage.setResizable(false);
        stage.show();
    }
}

