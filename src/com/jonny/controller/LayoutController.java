package com.jonny.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LayoutController {
    @FXML
    private TextField txtinput;
    @FXML
    private Label lbloutput;

    @FXML
    private void sendqueryaction(ActionEvent actionEvent) {
        if (!txtinput.getText().trim().isEmpty()){
            lbloutput.setText(txtinput.getText().trim());
        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("please fill input");
            alert.showAndWait();
        }
    }
}
