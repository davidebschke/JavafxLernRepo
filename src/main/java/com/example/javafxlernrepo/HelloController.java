package com.example.javafxlernrepo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;

public class HelloController {

    @FXML
    private Label welcomeText,byeText,folderCreate;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onByeButtonClick() {byeText.setText("Bye!");}

    public void onFolderCreateButtonClick() {
        File f = new File("C:\\Examples");
        if(f.mkdir()){
            folderCreate.setText("Folder is Created");
        }
        else {
            folderCreate.setText("Folder is NOT Created");
        }
    }
}
