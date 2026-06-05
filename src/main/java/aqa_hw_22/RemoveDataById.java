package aqa_hw_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveDataById {

    public static void main(String[] args) {
        String url = "jdbc:mysql://...";
        String user = "";
        String password = "";

        int idToRemove = 3;

        String sql = "DELETE FROM Artimovich_usersDataTable WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idToRemove);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
