package aqa_hw_22;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class UsersEmailsValidityTest {

    @Test
    public void verifyAllUsersHaveValidEmails() {


        String url = "jdbc:mysql://...";
        String user = "";
        String password = "";

        String sql = "SELECT login FROM Artimovich_usersDataTable";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            Assert.assertTrue(resultSet.next(), "Table Artimovich_usersDataTable is empty");

            do {

                String email = resultSet.getString("login");
                Assert.assertTrue(email.contains("@"), "Email does not contain @ symbol: " + email);
                Assert.assertTrue(email.contains("."), "Email does not contain dot: " + email);

            } while (resultSet.next());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
