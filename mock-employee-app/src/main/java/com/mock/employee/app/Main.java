package com.mock.employee.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //use FXMLLoaded to load the fxml file in the resources/views
        FXMLLoader loader = new FXMLLoader();

        //set the location of the file
        loader.setLocation(getClass().getResource("/views/MainView.fxml"));

        //create a layout and load the loader in the layout
        AnchorPane mainLayout = new AnchorPane();
        mainLayout = loader.load();

        //Create a scene using the layout
        Scene scene = new Scene(mainLayout);

        //set the scene and show the stage
        stage.setScene(scene);
        stage.show();
    }

}
