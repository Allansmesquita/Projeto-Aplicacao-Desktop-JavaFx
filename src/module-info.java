module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
    opens gui to javafx.graphics, javafx.fxml;
    //opens model.entities to javafx.graphics, javafx.fxml, javafx.base; // recomendação do colega nos comentários
    opens model.entities to javafx.base; //teste segundo o log da exception lançada.

    
    
}
