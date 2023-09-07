module com.demo.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens demo.parallel to javafx.fxml;
    exports demo.parallel;
}