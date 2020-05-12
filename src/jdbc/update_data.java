
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update_data 
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=katra","bipin","bipin1234");
       String name = null;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter name which you want to update:");
       name=sc.nextLine();
       String query="update user_detail set name='"+name+"' where rollno=110";
       PreparedStatement p=con.prepareStatement(query);
       int result= p.executeUpdate();
       System.out.println("how many row are affected! "+result);
       
    }
    
}
