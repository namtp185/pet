package app.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class QueryDataExample {
 
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
 
        // Get Connection
        Connection connection = ConnectionUtils.getMyConnection();
 
        // Create statement
        Statement statement = connection.createStatement();
 
        String sql = "select id, first_name, last_name, email, phone_number from owner";
 
        // Execute SQL statement returns a ResultSet object.
        ResultSet rs = statement.executeQuery(sql);
 
        // Fetch on the ResultSet        
        // Move the cursor to the next record.
        while (rs.next()) {
            int ownerId = rs.getInt(1);
            String firstName = rs.getString(2);
            String lastName = rs.getString("last_name");
            String email = rs.getString("email");
            String phoneNumber = rs.getString("phone_number");
            System.out.println("OwnerId:" + ownerId);
            System.out.println("OwnerFirstName:" + firstName);
            System.out.println("OwnerLastName:" + lastName);
            System.out.println("OwnerEmail:" + email);
            System.out.println("OwnerPhoneNumber:" + phoneNumber);
        }
 
        // Close connection.
        connection.close();
    }
 
}