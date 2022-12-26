package com.example.teklainashvili;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField AgeText;
    @FXML
    private TextField NameText;
    @FXML
    private TextField SurnameText;



    @FXML
    protected void print() {
        System.out.println("Name:"+NameText.getText());
        System.out.println("Surname:"+SurnameText.getText());
        System.out.println("Age:"+AgeText.getText());

    }
}