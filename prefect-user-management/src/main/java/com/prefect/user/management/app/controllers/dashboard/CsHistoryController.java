package com.prefect.user.management.app.controllers.dashboard;

import com.prefect.user.management.app.controllers.list.HistoryList;
import javafx.beans.property.SimpleObjectProperty;
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
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CsHistoryController implements Initializable {

    @FXML
    private TableView<HistoryList> table;

    @FXML
    private TableColumn<HistoryList, String> studentIdColumn;

    @FXML
    private TableColumn<HistoryList, LocalDate> dateRenderedColumn;

    @FXML
    private TableColumn<HistoryList, Integer> hoursRenderedColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getStudentId()));
        dateRenderedColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDateRendered()));
        hoursRenderedColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getHoursRendered()));

        table.getItems().addAll(
                new HistoryList("CT21-0001", LocalDate.of(2024, 1, 1), 8),
                new HistoryList("CT21-0002", LocalDate.of(2024, 1, 1), 6),
                new HistoryList("CT21-0004", LocalDate.of(2024, 1, 1), 7)
        );
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
