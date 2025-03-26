/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanagement.Entity;

/**
 *
 * @author ssara
 */
public class ProjectEntity {
    private int projId;
    private String projName;

    public ProjectEntity(int projId, String projName) {
        this.projId = projId;
        this.projName = projName;
    }

    public ProjectEntity() {
    }

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }
    
    
}
