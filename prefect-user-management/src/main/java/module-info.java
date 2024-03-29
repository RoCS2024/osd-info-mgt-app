module com.prefect.user.management.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.prefect.user.management.app to javafx.fxml;
    opens com.prefect.user.management.app.controllers.main to javafx.fxml;
    opens com.prefect.user.management.app.controllers.list to javafx.fxml;
    opens com.prefect.user.management.app.controllers.dashboard to javafx.fxml;

    exports com.prefect.user.management.app;
}