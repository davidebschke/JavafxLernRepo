package com.example.javafxlernrepo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;

public class CreateFolderController {

    @FXML
    private Label folderCreate;

    @FXML
    public void onFolderCreateButtonClick() {

        // aktuell wird der ordner immer auf C gespeichert und mit den Name examples versehen

        File f = new File("C:\\Examples");
        if(f.mkdir()){
            folderCreate.setText("Folder is Created");
        }
        else {
            folderCreate.setText("Folder is NOT Created");
        }
    }
}
