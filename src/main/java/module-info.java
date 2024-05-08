module org.example.part_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.part_4 to javafx.fxml;
    exports org.example.part_4;
}