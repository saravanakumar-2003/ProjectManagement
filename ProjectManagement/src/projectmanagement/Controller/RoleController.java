/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.Entity.RoleEntity;
import projectmanagement.Service.RoleService;

/**
 *
 * @author ssara
 */
public class RoleController {
    RoleService roleService;

    public RoleController() throws ClassNotFoundException, SQLException {
        this.roleService = new RoleService();
    }
    
    public ArrayList<RoleEntity> displayRole() throws SQLException{
        return roleService.displayRole();
    }
    
    
}
