/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.Entity.EmployeeEntity;
import projectmanagement.Entity.MappingEntity;
import projectmanagement.Service.MappingService;

/**
 *
 * @author ssara
 */
public class MappingController {
    
    MappingService mappingService;
    
    public MappingController() throws ClassNotFoundException, SQLException{
        this.mappingService = new MappingService();
    }
    
    public void mapProject(int emp_id, int proj_id, int role_id) throws SQLException{
        mappingService.mapProject(emp_id, proj_id, role_id);
    }
    
    public ArrayList<EmployeeEntity> displayEmployeesInProject(int proj_id) throws SQLException{
        return mappingService.displayEmployeesInProject(proj_id);
    }
    
    public int empCountInEachProject(int proj_id) throws SQLException{
        return mappingService.empCountInEachProject(proj_id);
    }
    
    public ArrayList<MappingEntity> displayMappedProjects() throws SQLException{
        return mappingService.displayMappedProjects();
    } 
    
    public void unmapEmployee(int emp_id, int proj_id) throws SQLException{
        mappingService.unmapEmployee(emp_id,proj_id);
    }
    
}
