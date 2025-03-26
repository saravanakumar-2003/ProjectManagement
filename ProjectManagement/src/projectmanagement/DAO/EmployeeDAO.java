/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import projectmanagement.Entity.EmployeeEntity;
import projectmanagement.Util.Util;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author ssara
 */
public class EmployeeDAO {
    
    ArrayList<EmployeeEntity> empList;
    Connection conn;
    PreparedStatement pstmt;
    Util util;

    public EmployeeDAO() throws ClassNotFoundException, SQLException {
        this.empList = new ArrayList<>();
        this.util = new Util();
        this.conn = util.connection();
        
    }
    
    
    
    public ArrayList<EmployeeEntity> displayEmployees() throws SQLException{
        
        int emp_id;
        String emp_name, designation;
        
        
        
        String selectQuery = "select * from employee_details e where e.emp_id not in (select emp_id from mapping_details)";
        pstmt = conn.prepareStatement(selectQuery);
        ResultSet employees = pstmt.executeQuery();
        while(employees.next()){
            
            EmployeeEntity emp = new EmployeeEntity();
            emp.setEmpId(employees.getInt("emp_id"));
            emp.setName(employees.getString("emp_name"));
            emp.setDesignation(employees.getString("designation")); 
            
            empList.add(emp);

        }
        
        return empList;
    }
    
}
