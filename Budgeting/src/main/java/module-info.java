module com.example.budgeting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.budgeting to javafx.fxml;
    exports com.example.budgeting;
}