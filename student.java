import java.util.ArrayList;

public class student{
    private String name;
    private double gpa;
    private static ArrayList<student> records = new ArrayList<>();

    student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public static void addtoBook (student student){
        records.add(student);
    }

    public static void removeFromBook(student student){
        records.remove(student);
    }

    public static ArrayList<student> getRecords(){
        return records;
    }


}