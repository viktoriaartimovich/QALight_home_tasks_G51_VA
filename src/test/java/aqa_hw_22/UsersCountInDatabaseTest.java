package aqa_hw_22;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class UsersCountInDatabaseTest {

    @Test
    public void verifyUserCountInDatabase() {

        String url = "jdbc:mysql://...";
        String user = "";
        String password = "";

        String sql = "SELECT COUNT(*) AS usersCount FROM Artimovich_usersDataTable";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            int actualUsersCount = resultSet.getInt("usersCount");

            Assert.assertEquals(actualUsersCount, 4);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}