/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ssara
 */
public class Util {
    public Connection connection() throws ClassNotFoundException, SQLException{
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/project_mapping";
        String user = "root";
        String password = "Sharu@1229";



        //Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establish connection
        conn = DriverManager.getConnection(url,user,password);
        System.out.println("Connected to MySQL database");
        return conn;
    }
}
