package com.merive;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CrypterController {
    public Spinner<Integer> key;
    public TextArea message;
    public TextField result;
    public Pane titlebar;

    double x, y;

    public void decrypt() {
        result.setText(Decrypt.decrypt(message.getText(), key.getValue()));
    }

    public void encrypt() {
        result.setText(Encrypt.encrypt(message.getText(), key.getValue()));
    }

    public void minimize() {
        ((Stage) titlebar.getScene().getWindow()).setIconified(true);
    }

    @FXML
    public void move(MouseEvent me) {
        Stage stage = (Stage) ((Node) me.getSource()).getScene().getWindow();
        stage.setX(me.getScreenX() - x);
        stage.setY(me.getScreenY() - y);
    }

    @FXML
    public void press(MouseEvent me) {
        x = me.getSceneX();
        y = me.getSceneY();
    }

    public void exit() {
        ((Stage) titlebar.getScene().getWindow()).close();
    }
}
