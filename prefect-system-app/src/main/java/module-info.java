module com.prefect.system.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.prefect.system.app.controllers.main to javafx.fxml;

    exports com.prefect.system.app;
}
