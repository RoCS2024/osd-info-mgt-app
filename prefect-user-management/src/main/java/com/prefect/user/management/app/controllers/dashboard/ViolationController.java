package com.prefect.user.management.app.controllers.dashboard;

import com.prefect.user.management.app.controllers.list.ViolationList;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViolationController implements Initializable {

    @FXML
    private TableView<ViolationList> table;

    @FXML
    private TableColumn<ViolationList, Integer> violationIdColumn;
    @FXML
    private TableColumn<ViolationList, String> violationNameColumn;

    @FXML
    private TableColumn<ViolationList, String> violationTypeColumn;

    @FXML
    private TableColumn<ViolationList, Integer> csHoursColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        violationIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getViolationId()));
        violationNameColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getViolationName()));
        violationTypeColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getViolationType()));
        csHoursColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getCsHours()));

        table.getItems().addAll(
                new ViolationList(1, "Fighting", "Major", 4),
                new ViolationList(2, "Littering", "Minor", 1),
                new ViolationList(3, "Bad Words", "Major", 2)
        );
    }

    @FXML
    protected void handleSubmitAddViolationButton(ActionEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.hide();
        showDashboard();
    }

    private void showDashboard() {
        try {
            Stage dashboardStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/views/AddViolation.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            dashboardStage.setScene(scene);
            dashboardStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleIconUserList(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/UserList.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleIconOffense(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/OffenseList.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleIconViolationList(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/ViolationList.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleIconCommunityService(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/CommunityService.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
