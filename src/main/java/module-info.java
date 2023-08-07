module com.starwars.starwars {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.starwars.starwars to javafx.fxml;
    exports com.starwars.starwars;
}