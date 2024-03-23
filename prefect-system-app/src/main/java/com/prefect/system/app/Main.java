package com.prefect.system.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //uses FXMLLoaded to load the FXML file in the resources/views
        FXMLLoader loader = new FXMLLoader();

        //set the location of the File
        loader.setLocation(getClass().getResource("/views/ViolationList.fxml"));


        //create a layout and load the loader in the layout
        BorderPane mainLayout = new BorderPane();
         mainLayout = loader.load();


        //Create  a scene using the layout
        Scene scene = new Scene(mainLayout);

        //set the scene and show the stage
        stage.setScene(scene);
        stage.show();

    }
}
