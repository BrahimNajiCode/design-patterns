package structural.composite.entreprise;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
// Leaf
public class Employee implements EntrepriseComponent{
    private int id;
    private String name;
    private float salary;
    private String role;


    @Override
    public float getSalary(){
        return this.salary;
    }
    @Override
    public void showDetails() {
        System.out.println("ID: "+id+", Name: "+name+", Salary: $"+salary+", Role: "+role);
    }
}
