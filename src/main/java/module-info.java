module com.example.soundbar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.soundbar to javafx.fxml;
    exports com.example.soundbar;
}