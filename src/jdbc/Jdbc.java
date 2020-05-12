package jdbc;

import java.sql.*;
public class Jdbc 
{

    public static void main(String args[]) throws Exception
    {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	       System.out.println("command completed successfully");
	       //ring ur="jdbc:sqlserver://localhost:1433;databaseName=jdbc;integratedSecurity=true;";
               String url="jdbc:sqlserver://localhost:1433;databaseName=bipin;";
               String name="bipin";
               String password="bipin1234";
	       Connection con=DriverManager.getConnection(url,name,password);
	       System.out.println("connection successefully done");
	       Statement st=con.createStatement();
	       String query="select *from katra";
	       ResultSet rs=st.executeQuery(query);
	       while(rs.next())
	       {
	           System.out.println(rs.getString(1)+" "+rs.getString(2)+" ");
	       }
	       
	
        
    }
    
}
