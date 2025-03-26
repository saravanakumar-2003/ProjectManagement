/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import projectmanagement.Util.Util;
import java.sql.ResultSet;
import projectmanagement.Entity.EmployeeEntity;
import projectmanagement.Entity.MappingEntity;

/**
 *
 * @author ssara
 */
public class MappingDAO {
    
    
    Connection conn;
    PreparedStatement pstmt;
    Util util;

    public MappingDAO() throws ClassNotFoundException, SQLException {
        this.util = new Util();
        this.conn = util.connection();
        
    }
    
    public void mapProject(int emp_id, int proj_id, int role_id) throws SQLException{
        String insertQuery = "insert into mapping_details(emp_id, proj_id, role_id) values (?,?,?)";
        pstmt = conn.prepareStatement(insertQuery);
        pstmt.setInt(1, emp_id);
        pstmt.setInt(2,proj_id);
        pstmt.setInt(3,role_id);
        pstmt.executeUpdate();
    }
    
    public ArrayList<EmployeeEntity> displayEmployeesInProject(int proj_id) throws SQLException{
        ArrayList<EmployeeEntity> empList = new ArrayList<EmployeeEntity>();
        String selectQuery = "select * from employee_details where emp_id in (select emp_id from mapping_details where proj_id = ?)";
        pstmt = conn.prepareStatement(selectQuery);
        pstmt.setInt(1,proj_id);
        ResultSet emp = pstmt.executeQuery();
        while(emp.next()){
            EmployeeEntity empEntity = new EmployeeEntity();
            empEntity.setEmpId(emp.getInt("emp_id"));
            empEntity.setName(emp.getString("emp_name"));
            empEntity.setDesignation(emp.getString("designation"));
            empList.add(empEntity);
        }
        return empList;
    }
    
    public int empCountInEachProject(int proj_id) throws SQLException{
        int count = 0;
        String countQuery = "select count(emp_id) from mapping_details where proj_id = ?";
        pstmt = conn.prepareStatement(countQuery);
        pstmt.setInt(1, proj_id);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            count = rs.getInt(1);
        }
        return count;
    }
    
    public ArrayList<MappingEntity> displayMappedProjects() throws SQLException{
        ArrayList<MappingEntity> mappedList = new ArrayList<>();
        String selectQuery = "select * from mapping_details";
        pstmt = conn.prepareStatement(selectQuery);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            MappingEntity mappingEntity = new MappingEntity();
            mappingEntity.setEmpId(rs.getInt("emp_id"));
            mappingEntity.setProjId(rs.getInt("proj_id"));
            mappingEntity.setRoleId(rs.getInt("role_id"));
            mappedList.add(mappingEntity);
        }
        return mappedList;
    }
    
    public void unmapEmployee(int emp_id , int proj_id) throws SQLException{
        String deleteQuery = "delete from mapping_details where emp_id = ? and proj_id = ?";
        pstmt = conn.prepareStatement(deleteQuery);
        pstmt.setInt(1,emp_id);
        pstmt.setInt(2,proj_id);
        pstmt.executeUpdate();
    }
}
