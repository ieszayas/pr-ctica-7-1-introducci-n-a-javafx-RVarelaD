module com.example.introduccion_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.introduccion_javafx to javafx.fxml;
    exports com.example.introduccion_javafx;
    exports Modelo_main; // Exporta el paquete para que JavaFX pueda acceder
    opens Modelo_main to javafx.graphics, javafx.fxml; // Permite acceso a reflexión
}