module edu.emailman.kotlinjavafxscatterchart {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens edu.emailman.kotlinjavafxscatterchart to javafx.fxml;
    exports edu.emailman.kotlinjavafxscatterchart;
}