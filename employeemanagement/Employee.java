package employeemanagement;
import java.util.ArrayList;

public class Employee { 
    private String name;
    private String role;
    private int employeeID;
    private double salary;
    private static ArrayList<Employee> compRecords = new ArrayList<>();

    public Employee(String name, String role, int employeeID){
        this.name = name;
        this.role = role;
        this.employeeID = employeeID;
        this.salary = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getemployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID (int employeeID){
        this.employeeID = employeeID;
    }

    public String getRole(){
        return role;
    }

    public void salary (double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setRole(String role){
        this.role = role;
    }

    public static void addEmployee(Employee employee){
        compRecords.add(employee);
    }
    public static void removeEmployee(Employee employee){
        compRecords.remove(employee);
    }

    public static ArrayList<Employee> getRecords(){
        return compRecords;
    }
}