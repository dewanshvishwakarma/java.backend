package jdbcdemo1;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//insert the data in table
public class DataBaseConnec {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	//load an register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
        
        //create connection
       Connection con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/smart","root","123456");
        System.out.println("connection done");
        
       PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
       ps.setString(1, "1");
       ps.setString(2, "sanajan");
       ps.setString(3,"72");
       
       int count=ps.executeUpdate();
       
       if(count>0) {
    	   System.out.println("data inserted");
       }else {
    	   System.out.println("error");
       }
       ps.close();
        con.close();
        
    }
}