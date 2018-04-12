/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import util.MySQLAccess;


/**
 *
 * @author Demir
 */
public class UserDAO {
    
    MySQLAccess u = new MySQLAccess();
    private ResultSet resultSet = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
      
	
	public List<User> getAllUsers() throws Exception{
		
		Connection conn = u.getConnection();
		List<User> users = new ArrayList<User>();
		statement = conn.createStatement();
		resultSet = statement
		          .executeQuery("select * from test.users");
		
		
		while(resultSet.next()){
		User user = new User();
		
		user.setId(resultSet.getInt("id"));
		user.setUsername(resultSet.getString("username"));
		user.setPassword(resultSet.getString("password"));
		users.add(user);
		}
		
		conn.close();
		return users;	
	} 
}
