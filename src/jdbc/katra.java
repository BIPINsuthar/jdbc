
package jdbc;
import java.sql.*;
import java.util.Scanner;

public class katra
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=katra;";
        String user="katra";
        String password="katrasamal";
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("connection success");
        String name;
       
        //Scanner s=new Scanner(System.in);
        //String query="insert into user_detail values(?,?,?,?)";
        String query1="delete from user_detail where age=20";
        PreparedStatement p=con.prepareStatement(query1);
//        System.out.println("enter user_detail values");
//        name=s.nextLine();
//        int rollno=s.nextInt();
//        int age=s.nextInt();
//        String city=s.nextLine();
//        p.setString(1,name);
//        p.setInt(2, rollno);
//        p.setInt(3, age);
//        p.setString(4,city);
        int result=p.executeUpdate();
        
        System.out.println("how many row affected:"+result);
       
    }
    
}
