module com.example.demo2gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reversestringapp to javafx.fxml;
    exports com.example.reversestringapp;
}