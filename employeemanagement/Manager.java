package employeemanagement;

public class Manager extends Employee implements Orientation{

    private int accessCode;
    private String name;
    private String role;
    private int employeeID;

    
    public Manager(String name, String role, int employeeID, int accessCode){
    super(name, role, employeeID);
    this.accessCode = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getemployeeID() {
        return this.employeeID;
    }

    @Override
    public void setEmployeeID (int employeeID){
        this.employeeID = employeeID;
    }

    @Override
    public String getRole(){
        return role;
    }

    @Override
    public void salary (double salary){
        double tax = salary * 0.1;
        super.salary(salary - tax);
    }

    @Override
    public double getSalary(){
        return super.getSalary();
    }

    @Override
    public void setRole(String role){
        this.role = role;
    }

    public void setAccessCode(){
        this.accessCode = 1234;
    }

     public void display(){
        System.out.println("Employee name: " + getName());
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + getSalary());
     }
    

    
    public void RoleDescription(){
    System.out.println("A manager's role is to lead, plan, organize, and control a group, project, or department within a business");
    }
    
}