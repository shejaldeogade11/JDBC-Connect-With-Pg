package JAVA;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class First {
	
	    public static void main(String[] args) {
	        Connection con;
	        Statement stmt;
	        ResultSet rs;

	        try {
	            String url = "jdbc:postgresql://localhost:5432/menucard";
	            String user = "postgres";
	            String pwd = "shejal@123";
	            con = DriverManager.getConnection(url, user, pwd);
	            System.out.println("Connection Ok");

	            stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM menu");

	            while (rs.next()) {
	                System.out.println(rs.getInt("mid") + " " + rs.getString("mname") + " " + rs.getInt("price"));
	            }

	          
	        } catch (Exception e) {
	        	  System.out.println(e);
	        }
	    }
	}



