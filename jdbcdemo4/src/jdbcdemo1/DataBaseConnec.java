package jdbcdemo1;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//fetch the data in database to an java code
public class DataBaseConnec {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	//load an register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
        
        //create connection
       Connection con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/smart","root","123456");
        System.out.println("connection done");
        
       PreparedStatement ps=con.prepareStatement("select * from student");
       ResultSet rs=ps.executeQuery();
//       while(rs.next()) {
//    	   int myid=rs.getInt( "id");
//    	   String myname=rs.getString("name");
//    	   int myage=rs.getInt("age");
//    	   
//    	   System.out.println("name is " + myname);
//    	   System.out.println("age is "  + myage);
//    	   System.out.println("myid is " + myid);
//       }
       rs.last();
       while(rs.previous()) {
    	   int myid=rs.getInt( "id");
    	   String myname=rs.getString("name");
    	   int myage=rs.getInt("age");
    	   
    	   System.out.println("name is " + myname);
    	   System.out.println("age is "  + myage);
    	   System.out.println("myid is " + myid);
       }
       
//       int count=ps.executeUpdate();
       
//       if(count>0) {
//    	   System.out.println("data inserted");
//       }else {
//    	   System.out.println("error");
//       }
       ps.close();
        con.close();
        
    }
}