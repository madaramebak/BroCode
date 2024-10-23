import java.util.*;


public class gradeBook{
    public static void main(String[] args) {
    student st1 = new student("John", 2.8);
    student st2 = new student("Zak", 3.5);
    student st3 = new student("Mo", 4.0);

    student.addtoBook(st1);
    student.addtoBook(st2);
    student.addtoBook(st3);

    ArrayList<student> records = student.getRecords();


    System.out.println("Student record book:");
    System.out.println("-----------");

    for(student kid: records){
        System.out.println("Name: " + kid.getName());
        System.out.println("GPA: " + kid.getGpa());
        System.out.println();
    }
    }

}