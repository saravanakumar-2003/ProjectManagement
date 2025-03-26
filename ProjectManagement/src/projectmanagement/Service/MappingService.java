/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.DAO.MappingDAO;
import projectmanagement.Entity.EmployeeEntity;
import projectmanagement.Entity.MappingEntity;

/**
 *
 * @author ssara
 */
public class MappingService {
    
    MappingDAO mappingDAO;
    
    public MappingService() throws ClassNotFoundException, SQLException{
        mappingDAO = new MappingDAO();
    }
    
    public void mapProject(int emp_id, int proj_id, int role_id) throws SQLException{
        mappingDAO.mapProject(emp_id, proj_id, role_id);
    }
    
    public ArrayList<EmployeeEntity> displayEmployeesInProject(int proj_id) throws SQLException{
        return mappingDAO.displayEmployeesInProject(proj_id);
    }
    
    public int empCountInEachProject(int proj_id) throws SQLException{
        return mappingDAO.empCountInEachProject(proj_id);
    }
    
    public ArrayList<MappingEntity> displayMappedProjects() throws SQLException{
        return mappingDAO.displayMappedProjects();
    }
    
    public void unmapEmployee(int emp_id, int proj_id) throws SQLException{
        mappingDAO.unmapEmployee(emp_id,proj_id);
    }
}

