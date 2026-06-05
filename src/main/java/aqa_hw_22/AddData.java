package aqa_hw_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://...";
        String user = "";
        String password = "";

        String userEmail = "newEmail@example.com";
        String userPassword = "Password2";

        String sql = "INSERT INTO Artimovich_usersDataTable (login, password) VALUES (?, ?)";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userEmail);
            preparedStatement.setString(2, userPassword);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
