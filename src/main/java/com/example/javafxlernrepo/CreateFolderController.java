package com.example.javafxlernrepo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.Objects;

public class CreateFolderController {

    DirectoryChooser directoryChooser = new DirectoryChooser();

    @FXML
    private Label folderCreate;
    Stage primarystage= new Stage();

    @FXML
    public void onFolderCreateButtonClick() {

        String path= ChoosePathForDirectory();
        // aktuell wird der ordner immer mit den Namen examples versehen

        if(Objects.equals(path, ""))
        {
            folderCreate.setText("Folder is NOT Created, because you have cancel the Directory Choose");
        }
        else
        {
            File f = new File(path+"\\Examples");
            if(f.mkdir()){
                folderCreate.setText("Folder is Created");
            }
            else {
                folderCreate.setText("Folder is NOT Created");
            }
        }
    }

    public String ChoosePathForDirectory(){

        String directoryPath;
        File selectedDirectory = directoryChooser.showDialog(primarystage);
        if(selectedDirectory==null)
        {
            directoryPath="";
            return directoryPath;
        }
        else
        {
            directoryPath=selectedDirectory.getAbsolutePath();
            return directoryPath;
        }
    }
}
