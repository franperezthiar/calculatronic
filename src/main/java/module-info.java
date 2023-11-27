module com.calculatronic.calculatronic {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.calculatronic.calculatronic to javafx.fxml;
    exports com.calculatronic.calculatronic;
}