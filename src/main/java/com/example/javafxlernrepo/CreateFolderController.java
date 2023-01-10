package com.example.javafxlernrepo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class CreateFolderController {

    DirectoryChooser directoryChooser = new DirectoryChooser();

    @FXML
    private Label folderCreate;
    Stage primarystage= new Stage();

    @FXML
    public void onFolderCreateButtonClick() {

        String path= ChoosePathForDirectory();
        // aktuell wird der ordner immer mit den Namen examples versehen

        File f = new File(path+"\\Examples");
        if(f.mkdir()){
            folderCreate.setText("Folder is Created");
        }
        else {
            folderCreate.setText("Folder is NOT Created");
        }
    }

    public String ChoosePathForDirectory(){

        String directoryPath;
        File selectedDirectory = directoryChooser.showDialog(primarystage);

        directoryPath=selectedDirectory.getAbsolutePath();
        return directoryPath;

    }
}
