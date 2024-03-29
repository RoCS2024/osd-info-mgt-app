package com.prefect.user.management.app.controllers.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField passwordShown;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ToggleButton toggleButton;

    @FXML
    void changeVisibility(ActionEvent event){
        if(toggleButton.isSelected()){
            passwordShown.setText(passwordField.getText());
            passwordShown.setVisible(true);
            passwordField.setVisible(false);
            return;
        }
        passwordField.setText(passwordShown.getText());
        passwordField.setVisible(true);
        passwordShown.setVisible(false);
    }

    public void logButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/UserList.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void signButtonOnAction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/CreateAcc.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void handleCancelForgotPsw(MouseEvent event) {
        try {
            Stage previousStage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            previousStage2.close();

            Stage dashboardStage2 = new Stage();
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(getClass().getResource("/views/MainView.fxml"));
            Parent root2 = loader2.load();
            Scene scene2 = new Scene(root2);
            dashboardStage2.setScene(scene2);
            dashboardStage2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleCancelChangePsw(MouseEvent event) {
        try {
            Stage previousStage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            previousStage2.close();

            Stage dashboardStage2 = new Stage();
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(getClass().getResource("/views/UserList.fxml"));
            Parent root2 = loader2.load();
            Scene scene2 = new Scene(root2);
            dashboardStage2.setScene(scene2);
            dashboardStage2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleCancelAddViolationClicked(MouseEvent event) {
        try {
            Stage previousStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            previousStage.close();

            Stage dashboardStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/views/ViolationList.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            dashboardStage.setScene(scene);
            dashboardStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void handleCancelAddOffenseClicked(MouseEvent event) {
        try {
            Stage previousStage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            previousStage2.close();

            Stage dashboardStage2 = new Stage();
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(getClass().getResource("/views/OffenseList.fxml"));
            Parent root2 = loader2.load();
            Scene scene2 = new Scene(root2);
            dashboardStage2.setScene(scene2);
            dashboardStage2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void handleCancelRenderCSClicked(MouseEvent event) {
        try {
            Stage previousStage3 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            previousStage3.close();

            Stage dashboardStage3 = new Stage();
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(getClass().getResource("/views/OffenseList.fxml"));
            Parent root3 = loader3.load();
            Scene scene3 = new Scene(root3);
            dashboardStage3.setScene(scene3);
            dashboardStage3.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleCancelEditOffenseClicked(MouseEvent event) {
        try {
            Stage previousStage4 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            previousStage4.close();

            Stage dashboardStage4 = new Stage();
            FXMLLoader loader4 = new FXMLLoader();
            loader4.setLocation(getClass().getResource("/views/OffenseList.fxml"));
            Parent root4 = loader4.load();
            Scene scene4 = new Scene(root4);
            dashboardStage4.setScene(scene4);
            dashboardStage4.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleForgotPsw(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/ForgotPsw.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleHaveAccount(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/MainView.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleRegisterNow(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/MainView.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
