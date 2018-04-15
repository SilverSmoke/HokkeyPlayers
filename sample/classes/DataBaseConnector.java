package sample.classes;

import java.sql.*;

public class DataBaseConnector {
    /**
    *JDBC URL, username and password of MySQL server
    */
    private static final String URL = "jdbc:mysql://localhost:3307/ast-1_hokkay";
    private static final String USER = "ast-1_player_hok";
    public static final String PASSWORD = "fjh&^Tf657679oif";

    /**
     * JDBC variables for opening and managing connection
     */
    private static Connection connection;
    private static Statement statement;

    public static ResultSet result(String query) throws SQLException {
        if(statement == null){
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();

        }

        try(ResultSet resultSet = statement.executeQuery(query)) {
            return resultSet;
        }
    }

    public static void update(String request) throws SQLException {
        statement.executeUpdate(request);
    }
}
