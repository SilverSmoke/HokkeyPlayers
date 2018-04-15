package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import sample.classes.DataBaseConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

    @FXML
    TextArea areaTest;


    public void clickMetod(ActionEvent actionEvent) throws SQLException {
        ResultSet resultSet = DataBaseConnector.result("select id");
        areaTest.setText(resultSet.toString());
        String SQL = "CREATE TABLE developers " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(50), " +
                    " specialty VARCHAR (50), " +
                    " salary INTEGER not NULL, " +
                    " PRIMARY KEY (id))";
        DataBaseConnector.update(SQL);

        //areaTest.
    }
}
