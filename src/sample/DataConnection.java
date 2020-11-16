package sample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class DataConnection {
    Connection connection = null;
    Statement statement = null;
    String url;

    public DataConnection (String url) {
        this.url = url;
    }


    public void connect () throws SQLException {
        connection = getConnection(this.url);
    }

    //createStatement is a function from the SQL library
    public void makeStatement () throws SQLException{
        this.statement = connection.createStatement();
    }

}
