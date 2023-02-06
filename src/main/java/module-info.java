module eus.ehu.a10 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.a10 to javafx.fxml;
    exports eus.ehu.a10;
}