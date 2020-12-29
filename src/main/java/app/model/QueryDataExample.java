package app.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import app.dto.OwnerListItemDTO;
 
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
        ResultSetMapper<OwnerListItemDTO> resultSetMapper = new ResultSetMapper<OwnerListItemDTO>();
        List<OwnerListItemDTO> pojoList = resultSetMapper.mapRersultSetToObject(rs, OwnerListItemDTO.class);
        if(pojoList != null){
			for(OwnerListItemDTO pojo : pojoList){
				System.out.println(pojo);
			}
		} else {
			System.out.println("ResultSet is empty. Please check if database table is empty");
		}
        connection.close();
    }
 
}