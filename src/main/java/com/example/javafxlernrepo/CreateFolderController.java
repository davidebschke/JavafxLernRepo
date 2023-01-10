package com.example.javafxlernrepo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class CreateFolderController {

    DirectoryChooser directoryChooser = new DirectoryChooser();

    @FXML
    private Label folderCreate,folderPath;
    Stage primarystage= new Stage();

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

    public String ondirectoryChooserButtonClick(){


        String directoryPath;

        File selectedDirectory = directoryChooser.showDialog(primarystage);

        directoryPath=selectedDirectory.getAbsolutePath();

        folderPath.setText(directoryPath);

        return directoryPath;

    }
}
