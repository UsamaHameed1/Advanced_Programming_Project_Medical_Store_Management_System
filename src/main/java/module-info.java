module com.medical_store_management_system {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.naming;
    requires java.desktop;


    opens com.medical_store_management_system.Business_Logic;
    opens com.medical_store_management_system.Database_Connectivity;
    opens com.medical_store_management_system.GUI_Layer.SalesMan_Controllers;
    opens com.medical_store_management_system.GUI_Layer.Pharamcist_Controllers;
    opens com.medical_store_management_system.GUI_Layer.Admin_Controllers;
    opens com.medical_store_management_system to javafx.fxml;
    exports com.medical_store_management_system;
    opens com.medical_store_management_system.GUI_Layer.Main_Login_Screen;
}