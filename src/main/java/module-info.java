module SortVisualizerFX {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.sahil.sortvisualizerfx;
    exports com.sahil.sortvisualizerfx.sorting;
    opens com.sahil.sortvisualizerfx to javafx.fxml;
}