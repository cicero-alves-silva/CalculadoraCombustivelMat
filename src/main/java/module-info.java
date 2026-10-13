module com.example.calculadoracombustivelmat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoracombustivelmat to javafx.fxml;
    exports com.example.calculadoracombustivelmat;
}