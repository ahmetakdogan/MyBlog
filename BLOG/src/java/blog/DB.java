package blog;

import java.sql.*;

public class DB 
{
    String cS= "jdbc:mysql://localhost/blog";
    Connection c;
    
    public DB() throws Exception
    {
        Class.forName("org.gjt.mm.mysql.Driver");
        
        c = DriverManager.getConnection(cS,"root","");
    }
    
    public ResultSet qWR(String sql) throws Exception
    {
        return c.createStatement().executeQuery(sql);
    }
    
    public void qNR(String sql) throws Exception
    {
        c.createStatement().execute(sql);
    }
}
