module com.mock.employee.app {

    requires javafx.controls;
    requires javafx.fxml;


    opens com.mock.employee.app to javafx.fxml;
    opens com.mock.employee.app.controllers.main to javafx.fxml;
    opens com.mock.employee.app.controllers.dashboard to javafx.fxml;


    exports com.mock.employee.app;
    exports com.mock.employee.app.controllers.main;
    exports com.mock.employee.app.controllers.dashboard;

}