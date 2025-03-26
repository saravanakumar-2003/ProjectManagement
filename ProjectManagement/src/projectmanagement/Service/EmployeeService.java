/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.DAO.EmployeeDAO;
import projectmanagement.Entity.EmployeeEntity;

/**
 *
 * @author ssara
 */
public class EmployeeService {
    
    EmployeeDAO employeeDAO;

    public EmployeeService() throws ClassNotFoundException, SQLException {
        this.employeeDAO = new EmployeeDAO();
    }
    
    public ArrayList<EmployeeEntity> displayEmployees() throws SQLException{
        
        return employeeDAO.displayEmployees();
    }
    
    
}
