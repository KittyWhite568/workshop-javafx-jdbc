module workshop.javafx.jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; 
    
    opens application to javafx.graphics, javafx.fxml, javafx.base;
    opens gui to javafx.fxml;
    opens model.services to javafx.base; 
    opens model.entities to javafx.base;

    exports model.entities;
}

