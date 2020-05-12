
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Stored_Parameter
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        int value = 0;
        String url="jdbc:sqlserver://localhost:1433;databaseName=katra";
        String name="bipin";
        String pass="bipin1234";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection(url,name,pass);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age value:");
        value=sc.nextInt();
        CallableStatement cs=con.prepareCall("{call setrollno(?)}");
        cs.setInt(1,value);
        boolean r=cs.execute();
        if(r)
        {
            ResultSet rs=cs.getResultSet();
            while(rs.next())
            {
                System.out.println("the value is:");
                System.out.println("\n"+rs.getString(1));
            }
        
        }
        
    }
    
}
