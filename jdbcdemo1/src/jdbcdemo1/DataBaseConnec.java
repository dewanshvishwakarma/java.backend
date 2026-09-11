package jdbcdemo1;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


// connect the database and create an table
public class DataBaseConnec {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	//load an register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
        
        //create connection
       Connection con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/smart","root","123456");
        System.out.println("connection done");
        
        Statement st=con.createStatement();
        
        String quarry= """
                CREATE TABLE student (
                id INT PRIMARY KEY,
                name VARCHAR(50),
                age INT
            )
            """;
        
        st.executeUpdate(quarry);
        System.out.println("table created");
        st.close();
        con.close();
        
        
        
        

    }
}