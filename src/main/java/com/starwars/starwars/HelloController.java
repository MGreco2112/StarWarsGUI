package com.starwars.starwars;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ChoiceBox<Integer> attributeBox;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void populateChoiceBox() {
        attributeBox.setItems(FXCollections.observableArrayList(2, 3, 4));
    }
}