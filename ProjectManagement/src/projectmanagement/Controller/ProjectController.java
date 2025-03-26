/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.Entity.ProjectEntity;
import projectmanagement.Service.ProjectService;

/**
 *
 * @author ssara
 */
public class ProjectController {
    
    ProjectService projectService;

    public ProjectController() throws SQLException , ClassNotFoundException{
        this.projectService = new ProjectService();
    }
    
    
    public ArrayList<ProjectEntity> displayProjects() throws SQLException{
        return projectService.displayProjects();
    }
    
}
