module com.user.management.mockui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;



    opens com.user.management.mockui to javafx.fxml;
    opens com.user.management.mockui.controllers.main to javafx.fxml;
    opens com.user.management.mockui.controllers.list to javafx.fxml;




    exports com.user.management.mockui;
    exports com.user.management.mockui.controllers.main;
    exports com.user.management.mockui.controllers.list;



}