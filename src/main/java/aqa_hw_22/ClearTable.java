package aqa_hw_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClearTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://...";
        String user = "";
        String password = "";

        String sql = "DELETE FROM Artimovich_usersDataTable";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
