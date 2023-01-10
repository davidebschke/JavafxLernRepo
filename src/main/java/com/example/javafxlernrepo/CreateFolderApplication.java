package com.example.javafxlernrepo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateFolderApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CreateFolderApplication.class.getResource("FolderApp-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400); // Größe des Angezeigten Desktop Fensters
        stage.setTitle("Folder Creation"); // Titel der am Fenster angezeigt wird
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
