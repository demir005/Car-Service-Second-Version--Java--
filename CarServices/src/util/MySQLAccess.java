/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.DriverManager;
import java.sql.Connection;

public class MySQLAccess {
	
	public Connection connect = null;

	  public Connection getConnection() throws Exception {
		    try {
		      // This will load the MySQL driver, each DB has its own driver
		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/test?"
		              + "user=root&password=admin");

		      return connect;
		      

		    } catch (Exception e) {
		      throw e;
		      
		    } 

		  }
}