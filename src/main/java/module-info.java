module sistema.simplebanco {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens sistema.simplebanco to javafx.fxml;
    exports sistema.simplebanco;
}
