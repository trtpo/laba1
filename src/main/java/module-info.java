module demo.parallel {
    requires javafx.controls;
    requires javafx.fxml;

    opens demo.parallel to javafx.fxml;
    exports demo.parallel;
}