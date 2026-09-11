package jdbcdemo1;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//update the data in table
public class DataBaseConnec {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	//load an register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
        
        //create connection
       Connection con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/smart","root","123456");
        System.out.println("connection done");
        
       PreparedStatement ps=con.prepareStatement("update student set name=? where id=?");
       ps.setString(1, "arjun");
       ps.setString(2, "1");
       
       int count=ps.executeUpdate();
       
       if(count>0) {
    	   System.out.println("data updated");
       }else {
    	   System.out.println("error");
       }
       ps.close();
        con.close();
        
    }
}