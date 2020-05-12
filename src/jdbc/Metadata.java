
package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Metadata 
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=katra;","bipin","bipin1234");
        DatabaseMetaData d=con.getMetaData();
        System.out.println("databaseproductname::"+d.getDatabaseProductName());
        System.out.println("product version::"+d.getDatabaseProductVersion());
        System.out.println("Driver name::"+d.getDriverName());
        System.out.println("get url name::"+d.getURL());
        System.out.println("user name::"+d.getUserName());    
    }
    
}
