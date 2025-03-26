/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.Entity.EmployeeEntity;
import projectmanagement.Entity.ProjectEntity;
import projectmanagement.Util.Util;
import java.sql.ResultSet;

/**
 *
 * @author ssara
 */
public class ProjectDAO {
    
    ArrayList<ProjectEntity> projectList;
    Connection conn;
    PreparedStatement pstmt;
    Util util;

    public ProjectDAO() throws ClassNotFoundException, SQLException {
        this.projectList = new ArrayList<>();
        this.util = new Util();
        this.conn = util.connection();
        
    }
    
    public ArrayList<ProjectEntity> displayProjects() throws SQLException{
        String selectQuery = "select * from project_details";
        pstmt = conn.prepareStatement(selectQuery);
        ResultSet projects = pstmt.executeQuery();
        while(projects.next()){
            ProjectEntity proj = new ProjectEntity();
            proj.setProjId(projects.getInt("proj_id"));
            proj.setProjName(projects.getString("proj_name"));
            projectList.add(proj);
        }
        return projectList;
    }
    
    
}
