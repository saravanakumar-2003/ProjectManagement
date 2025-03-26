/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmanagement;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import projectmanagement.Controller.EmployeeController;
import projectmanagement.Controller.MappingController;
import projectmanagement.Controller.ProjectController;
import projectmanagement.Controller.RoleController;
import projectmanagement.Entity.EmployeeEntity;
import projectmanagement.Entity.MappingEntity;
import projectmanagement.Entity.ProjectEntity;
import projectmanagement.Entity.RoleEntity;

/**
 *
 * @author ssara
 */
public class ProjectManagement {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        ProjectController projectController = new ProjectController();
        RoleController roleController = new RoleController();
        MappingController mappingController = new MappingController();

        int ch ;
        while(true){
            System.out.print("1.Map project\n2.Display unmapped employees\n3.Display employess in a particular project\n4.Number of employees in a particular project\n5.Unmap employee from project\nEnter choice: ");
            ch = in.nextInt();
            System.out.println();
            
            ArrayList<ProjectEntity> projectList;
            switch(ch){
                case 1:
                    {
                        System.out.println("UnMapped Employee\n");

                        ArrayList<EmployeeEntity>  empList = employeeController.displayEmployees();

                        System.out.println("Emp Id\tEmp Name\n");
                        for(EmployeeEntity e : empList){

                            System.out.println(e.getEmpId() +"\t"+e.getName());
                        }

                        System.out.println("\nEnter emp  id : ");
                        int emp_id = in.nextInt();

                        System.out.println("\nProject List");

                        projectList = projectController.displayProjects();
                        System.out.println("Proj id\tProj Name\n");
                        for(ProjectEntity e : projectList){
                            System.out.println(e.getProjId() + "\t" + e.getProjName());
                        }

                        System.out.println("\nEnter project  id : ");
                        int proj_id = in.nextInt();


                        System.out.println("\nRole list");

                        ArrayList<RoleEntity> roleList = roleController.displayRole();
                        System.out.println("Role id\tRole Name\n");
                        for(RoleEntity e : roleList){
                            System.out.println(e.getRoleId() + "\t" + e.getRoleName());
                        }


                        System.out.println("\nEnter role  id : ");
                        int role_id = in.nextInt();

                        mappingController.mapProject(emp_id,proj_id,role_id);

                    }
                    break;

                case 2:
                    {
                        System.out.println("UnMapped Employee\n");

                        ArrayList<EmployeeEntity>  empList = employeeController.displayEmployees();

                        System.out.println("Emp Id\tEmp Name\n");
                        for(EmployeeEntity e : empList){

                            System.out.println(e.getEmpId() +"\t"+e.getName());
                        }
                    }
                break;
                
                case 3:
                    {
                        System.out.println("\nProject List");

                        projectList = projectController.displayProjects();
                        System.out.println("Proj id\tProj Name\n");
                        for(ProjectEntity e : projectList){
                            System.out.println(e.getProjId() + "\t" + e.getProjName());
                        }
                        System.out.println("\nEnter project id to display employees : ");
                        int proj_id = in.nextInt();


                        ArrayList<EmployeeEntity> empProjList = mappingController.displayEmployeesInProject(proj_id);
                        System.out.println("Emp Id\tEmp Name\tEmp designation\n");
                        for (EmployeeEntity e : empProjList){
                            System.out.println(e.getEmpId() + "\t" + e.getName() + "\t" + e.getDesignation());
                        }
                    }
                    break;
                    
                case 4:
                    {
                        projectList = projectController.displayProjects();
                        System.out.println("Proj id\tProj Name\n");
                        for(ProjectEntity e : projectList){
                            System.out.println(e.getProjId() + "\t" + e.getProjName());
                        }

                        System.out.println("\nEnter project  id : ");
                        int proj_id = in.nextInt();
                        
                        int count = mappingController.empCountInEachProject(proj_id);
                        System.out.println("Employees in project id " + proj_id + " = " + count);
                    }
                    break;
                    
                case 5:
                    {
                        int emp_id,proj_id;
                        System.out.println("Mapped Projects for employees");
                        ArrayList<MappingEntity> mappedList = mappingController.displayMappedProjects();
                        System.out.println("\nemp_id\tproj_id\trole_id\n");
                        for(MappingEntity m : mappedList){
                            System.out.println(m.getEmpId() + "\t" + m.getProjId() + "\t" + m.getRoleId());
                        }
                        System.out.println("Enter emp id : ");
                        emp_id = in.nextInt();
                        System.out.println("Enter proj id : ");
                        proj_id = in.nextInt();
                        
                        mappingController.unmapEmployee(emp_id,proj_id);
                        System.out.println("Unmapping success");
                    }
                    break;
            }
        }
    }
    
}