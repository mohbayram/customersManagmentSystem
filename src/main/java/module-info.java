module com.example.customermanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.customermanagmentsystem to javafx.fxml;
    exports com.example.customermanagmentsystem;
}