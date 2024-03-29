module com.student.information.mock {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.student.information.mock to javafx.fxml;
    opens com.student.information.mock.controllers.main to javafx.fxml;
    opens com.student.information.mock.controllers.list to javafx.fxml;
    opens com.student.information.mock.controllers.dashboard to javafx.fxml;


    exports com.student.information.mock;
    exports com.student.information.mock.controllers.main;
    exports com.student.information.mock.controllers.list;
}