
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StoredProcedure
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=katra;";
        String name="bipin";
        String pass="bipin1234";
        Connection con=DriverManager.getConnection(url,name,pass);
        CallableStatement cs=con.prepareCall("{call detail}");
        boolean r=cs.execute();
        if(r)
        {
            ResultSet res=cs.getResultSet();
            while(res.next())
            {
                System.out.println("\n"+res.getString(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4));
            }
            
        }
        
    
    }
    
}
