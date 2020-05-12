
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Commit_Demo 
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=katra;","bipin","bipin1234");
        con.setAutoCommit(false);
        Statement st=con.createStatement();
        String sql="";
        con.commit();
        ResultSet r=st.executeQuery(sql);
        con.rollback();
    }
    
}
