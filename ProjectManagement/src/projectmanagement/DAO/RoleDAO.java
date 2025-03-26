/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.Entity.RoleEntity;
import projectmanagement.Util.Util;
import java.sql.ResultSet;

/**
 *
 * @author ssara
 */
public class RoleDAO {

    ArrayList<RoleEntity> roleList;
    Connection conn;
    PreparedStatement pstmt;
    Util util;

    public RoleDAO() throws ClassNotFoundException, SQLException {
        this.roleList = new ArrayList<>();
        this.util = new Util();
        this.conn = util.connection();
        
    }
    
    public ArrayList<RoleEntity> displayRole() throws SQLException{
        
        String selectQuery = "select * from role_details";
        pstmt = conn.prepareStatement(selectQuery);
        ResultSet roles = pstmt.executeQuery();
        while(roles.next()){
            RoleEntity roleEntity = new RoleEntity();
            roleEntity.setRoleId(roles.getInt("role_id"));
            roleEntity.setRoleName(roles.getString("role_name"));
            roleList.add(roleEntity);
        }
        return roleList;
    }
    
    
}
