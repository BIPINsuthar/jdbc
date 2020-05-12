
package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Prepare 
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String url="jdbc:sqlserver://localhost:1433;databaseName=bipin;";
       String uname="bipin";
       String pass="bipin1234";
       Connection con=DriverManager.getConnection(url,uname,pass);
       //this for inserting value 
       //String query="insert into katra values (?,?)";
       //this for deleting value
       String query="delete from katra where name='parth'";
       PreparedStatement ps=con.prepareStatement(query);
      // Scanner sc=new Scanner(System.in); 
       //Scanner s=new Scanner(System.in);
       
       //System.out.println("Enter the student enrollno: and name:");
       //int n=s.nextInt();
       //String name=sc.nextLine();
       //ps.setString(1,name);
       //ps.setInt(2,n);
       int result=ps.executeUpdate();
       System.out.println("how many value effected:"+result);
       
       
       
       
       
    }
    
}
