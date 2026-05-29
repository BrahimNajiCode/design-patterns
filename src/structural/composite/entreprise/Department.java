package structural.composite.entreprise;


import java.util.ArrayList;
import java.util.List;

// Composite
public class Department implements EntrepriseComponent{
    private int DepartmentID;
    private String name;
    private List<EntrepriseComponent> department;

    public Department(int DepartmentID, String name){
        this.DepartmentID = DepartmentID;
        this.name = name;
        department = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        department.add(e);
    }
    public void deleteEmployee(Employee e){
        department.remove(e);
    }
    @Override
    public float getSalary() {
        System.out.println("Department Name: "+name);
        float sum=0;
        for(EntrepriseComponent e:department){sum+=e.getSalary();}
        return sum;
    }

    @Override
    public void showDetails() {
        System.out.println("Department Name: "+name);
        for(EntrepriseComponent e: department){
            e.showDetails();
        }
    }
}
