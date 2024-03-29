package com.prefect.user.management.app.controllers.dashboard;

import com.prefect.user.management.app.controllers.list.OffenseList;
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
import java.util.ResourceBundle;

public class OffenseController implements Initializable {
    @FXML
    private TableView<OffenseList> table;
    @FXML
    private TableColumn<OffenseList, String> studentIdColumn;
    @FXML
    private TableColumn<OffenseList, Integer> violationIdColumn;
    @FXML
    private TableColumn<OffenseList, LocalDate> dateOfOffenseColumn;
    @FXML
    private TableColumn<OffenseList, String> actionColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getStudentId()));
        violationIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getViolationId()));
        dateOfOffenseColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getOffenseDate()));
        actionColumn.setCellValueFactory(new PropertyValueFactory<>("Action"));

        Callback<TableColumn<OffenseList, String>, TableCell<OffenseList, String>> cellFactory =
                new Callback<>() {
                    @Override
                    public TableCell<OffenseList, String> call(final TableColumn<OffenseList, String> param) {
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
                                        handleEditButton();
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
                                    setGraphic(btn);
                                    setText(null);
                                }
                            }
                        };
                    }
                };

        actionColumn.setCellFactory(cellFactory);

        table.getItems().addAll(
                new OffenseList("CT21-0048", 1, LocalDate.of(2024, 1, 1), "edit"),
                new OffenseList("CT21-0148", 2, LocalDate.of(2024, 1, 2), "edit"),
                new OffenseList("CT21-1048", 3, LocalDate.of(2024, 1, 3), "edit")
        );
    }

    @FXML
    private void handleEditButton() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/EditOffense.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) actionColumn.getTableView().getScene().getWindow();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
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

    @FXML
    protected void handleSubmitAddOffenseButton(ActionEvent event) {
        Stage stage2 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage2.hide();
        showDashboard2();
    }

    @FXML
    protected void handleSubmitRenderCSButton(ActionEvent event) {
        Stage stage3 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage3.hide();
        showDashboard3();
    }


    private void showDashboard2() {
        try {
            Stage dashboardStage2 = new Stage();
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(getClass().getResource("/views/AddOffense.fxml"));
            Parent root2 = loader2.load();
            Scene scene2 = new Scene(root2);
            dashboardStage2.setScene(scene2);
            dashboardStage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDashboard3() {
        try {
            Stage dashboardStage3 = new Stage();
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(getClass().getResource("/views/RenderCS.fxml"));
            Parent root3 = loader3.load();
            Scene scene3 = new Scene(root3);
            dashboardStage3.setScene(scene3);
            dashboardStage3.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
