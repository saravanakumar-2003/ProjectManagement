/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.Entity.EmployeeEntity;
import projectmanagement.Service.EmployeeService;

/**
 *
 * @author ssara
 */
public class EmployeeController {
    
    EmployeeService employeeService;

    public EmployeeController() throws ClassNotFoundException, SQLException {
        this.employeeService = new EmployeeService();
    }
    
    public ArrayList<EmployeeEntity> displayEmployees() throws SQLException {
        return employeeService.displayEmployees();
    }
    
    
    
}
