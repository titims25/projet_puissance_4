package interaction;
import modele.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DBControl {
    private DBConnect dbConnect;
    public DBControl(){
        dbConnect = new DBConnect();
    }
    public void createUser(String username, String password) {
        Connection connection = dbConnect.getConnection();
        PreparedStatement preparedStatement = null;

        try {
            String insertQuery = "INSERT INTO users (username, password) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

