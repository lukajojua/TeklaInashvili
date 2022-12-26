module com.example.teklainashvili {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teklainashvili to javafx.fxml;
    exports com.example.teklainashvili;
}