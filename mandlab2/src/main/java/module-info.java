module com.example.mandlab2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.mandlab2 to javafx.fxml;
    exports com.example.mandlab2;
}