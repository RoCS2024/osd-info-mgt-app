package com.prefect.user.management.app.controllers.dashboard;

import com.prefect.user.management.app.controllers.list.UserList;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javafx.util.Callback;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {
    @FXML
    private TableView<UserList> table;

    @FXML
    private TableColumn<UserList, Integer> userIdColumn;

    @FXML
    private TableColumn<UserList, String> usernameColumn;

    @FXML
    private TableColumn<UserList, String> entityIdColumn;

    @FXML
    private TableColumn<UserList, LocalDate> dateCreatedColumn;

    @FXML
    private TableColumn<UserList, LocalDate> dateModifiedColumn;

    @FXML
    private TableColumn<UserList, String> actionColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getUserid()));
        usernameColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getUsername()));
        entityIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getEntityId()));
        dateCreatedColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDateCreated()));
        dateModifiedColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDateModified()));
        actionColumn.setCellValueFactory(new PropertyValueFactory<>("DUMMY"));

        Callback<TableColumn<UserList, String>, TableCell<UserList, String>> cellFactory =
                new Callback<>() {
                    @Override
                    public TableCell<UserList, String> call(final TableColumn<UserList, String> param) {
                        return new TableCell<>() {
                            Button btn = new Button();
                            {
                                Image image = new Image(getClass().getResourceAsStream("/images/edit.png"));
                                ImageView imageView = new ImageView(image);
                                imageView.setFitWidth(20);
                                imageView.setFitHeight(20);

                                btn.setGraphic(imageView);

                                btn.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        handleEditButton(); // Call the method directly
                                    }
                                });
                            }

                            @Override
                            public void updateItem(String item, boolean empty) {
                                super.updateItem(item, empty);
                                if (empty) {
                                    setGraphic(null);
                                    setText(null);
                                } else {
                                    setGraphic(btn); // Set the Button directly as graphic
                                    setText(null);
                                }
                            }
                        };
                    }
                };

        actionColumn.setCellFactory(cellFactory);

        table.getItems().addAll(
                new UserList(1, "Zhai", "CT21-0048", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 1), "edit"),
                new UserList(2, "Aira", "CT21-0148", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 1), "edit"),
                new UserList(3, "Nicole", "CT21-1048", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 1), "edit")
        );
    }
    @FXML
    private void handleEditButton() {
        try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/ChangePsw.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) actionColumn.getTableView().getScene().getWindow();

            // Set the new scene
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle any potential IO exception
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
