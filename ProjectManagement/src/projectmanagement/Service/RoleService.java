/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.DAO.RoleDAO;
import projectmanagement.Entity.RoleEntity;

/**
 *
 * @author ssara
 */
public class RoleService {
    RoleDAO roleDAO;

    public RoleService() throws ClassNotFoundException, SQLException {
        this.roleDAO = new RoleDAO();
    }
    
    
    
    public ArrayList<RoleEntity> displayRole() throws SQLException{
        return roleDAO.displayRole();
    }
}
