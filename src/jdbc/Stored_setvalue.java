
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Stored_setvalue 
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        String name = null,city = null;
        int age = 0,no = 0;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=katra","bipin","bipin1234");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user_detail name,no,age,city value:");
        name=sc.nextLine();
        no=sc.nextInt();
        age=sc.nextInt();
        city=sc.nextLine();
        CallableStatement cs=con.prepareCall("{call setvalue(?,?,?,?)}");
        cs.setString(1,name);
        cs.setInt(2,no);
        cs.setInt(3,age);
        cs.setString(4,city);
       
        boolean r=cs.execute();
        if(r)
        { 
            ResultSet rs=cs.getResultSet();
            while(rs.next())
            {
                System.out.println("\n"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }
        
        }
    }
    
}
