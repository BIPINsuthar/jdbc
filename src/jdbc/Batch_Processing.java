
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_Processing
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=katra;","bipin","bipin1234");
       Statement st=con.createStatement();
       String q1,q2,q3,q4,q5,q6;
       q1="create table student_data(name varchar(2),no int,branch char(10))";
       q2="insert into student_data values('bipin','110','it')";
       q3="insert into student_data values('mayur','76','mech')";
       //q4="insert into student_data values('suthar','10','cs')";
       q5="update student_data set no=56 where name='mayur'";
      // q6 = "delete from student_data where name='suthar'";
       
       st.addBatch(q1);
       st.addBatch(q2);
       st.addBatch(q3);
       //st.addBatch(q4);
       st.addBatch(q5);
       //st.addBatch(q6);
       
       int i[]=st.executeBatch();
       con.commit();
    }
    
}
