/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Entity;

/**
 *
 * @author ssara
 */
public class MappingEntity {
    
    private int empId;
    private int projId;
    private int roleId;

    public MappingEntity(int empId, int projId, int roleId) {
        this.empId = empId;
        this.projId = projId;
        this.roleId = roleId;
    }

    public MappingEntity() {
    }
    
    

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    
    
    
    
    
}
