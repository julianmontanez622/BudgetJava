module com.example.budgetproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.budgetproj to javafx.fxml;
    exports com.example.budgetproj;
}