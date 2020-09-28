
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class db_connection {
    
    private static String serverName="localhost";
    private static String userName="root";
    private static String dbName="pizza_order_mng";
    private static int portNumber=3306;
    private static String password="";
    
    public static Connection getConnection()
    {
        java.sql.Connection con = null;
        MysqlDataSource ds=new MysqlDataSource();
        ds.setServerName(serverName);
        ds.setUser(userName);
        ds.setPassword(password);
        ds.setDatabaseName(dbName);
        ds.setPortNumber(portNumber);
        try {    
            con=ds.getConnection();
            //System.out.println("hello!");
         }    
         catch (SQLException ex) {}
        return (Connection) con;
    }
    
}
