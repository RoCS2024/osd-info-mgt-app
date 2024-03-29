package com.mock.employee.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //use FXMLLoaded to load the fxml file in the resources/views
        FXMLLoader loaders = new FXMLLoader();

        //set the location of the file
        loaders.setLocation(getClass().getResource("/views/DashboardView.fxml"));

        //create a layout and load the loader in the layout
        BorderPane mainLayout = new BorderPane();
        mainLayout = loaders.load();

        //Create a scene using the layout
        Scene scene = new Scene(mainLayout);

        //set the scene and show the stage
        stage.setScene(scene);
        stage.show();
    }
}

