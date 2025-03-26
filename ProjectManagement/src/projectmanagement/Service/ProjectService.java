/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.DAO.ProjectDAO;
import projectmanagement.Entity.ProjectEntity;

/**
 *
 * @author ssara
 */
public class ProjectService {
    
    ProjectDAO projectDAO;

    public ProjectService() throws ClassNotFoundException, SQLException {
        this.projectDAO = new ProjectDAO();
    }
    
    public ArrayList<ProjectEntity> displayProjects() throws SQLException{
        return projectDAO.displayProjects();
    }
    
    
    
}
