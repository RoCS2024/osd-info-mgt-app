package com.mock.employee.app.controllers.main;


import  javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController {

    @FXML
    protected void handleListButtonAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/DashboardView.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showDashboard() {
        try {
            Stage dasboardStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/views/MainView.fxml"));
            BorderPane dashboardLayout = new BorderPane();
            dashboardLayout = loader.load();
            Scene scene = new Scene(dashboardLayout);
            dasboardStage.setScene(scene);
            dasboardStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
