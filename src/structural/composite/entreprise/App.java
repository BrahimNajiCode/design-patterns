package structural.composite.entreprise;

public class App {
    public static void main(String[] args) {
        Department ITdepartment = new Department(1, "IT ");
        Employee e1 = new Employee(1,"Naji Brahim", 3546.1f,"STAFF Engineer");
        Employee e2 = new Employee(2,"Naji Ziyad", 2400,"Software Engineer");
        Employee e3 = new Employee(3,"Naji Salah", 3000,"Data Engineer");

        // Add employees to IT Department
        ITdepartment.addEmployee(e1);
        ITdepartment.addEmployee(e2);
        ITdepartment.addEmployee(e3);

        // Not exactly total charge, but just for demo purposes.
        System.out.println("TOTAL CHARGE FOR IT DEPARTMENT: "+ ITdepartment.getSalary());
        ITdepartment.showDetails();

        Department HRdepartment = new Department(2, "HR");
        Employee e11 = new Employee(11,"Naji Ahmed", 2500f,"Compensation & Benefits");
        Employee e12 = new Employee(12,"Naji Wanda", 3000f,"Recruitment & Staffing");
        Employee e13 = new Employee(13,"Naji Jessica", 2100f,"Training & Development");

        HRdepartment.addEmployee(e11);
        HRdepartment.addEmployee(e12);
        HRdepartment.addEmployee(e13);

        System.out.println("TOTAL CHARGE FOR HR DEPARTMENT: "+ HRdepartment.getSalary());
        HRdepartment.showDetails();
    }
}
