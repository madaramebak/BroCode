import utilities;
import java.util.Scanner;

public class calculator{
    public static double addition(int num1, int num2){
        return num1 + num2;
    }

    public static double subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static double multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static double division(int num1, int num2){
        return (double) num1 / num2;
    }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();

        input.nextLine();

        System.out.println("Ok, Now please choose from the following operations (addition, subtraction, multiplication, division): ");
        String operation = input.nextLine();

        double result = 0;
        if(operation.toLowerCase().equals("addition")){
           result = calculator.addition(num1, num2);
        }
        else if (operation.toLowerCase().equals("subtraction")){
             result = calculator.subtraction(num1, num2);
        } 
        else if(operation.toLowerCase().equals("multiplication")){
               result = calculator.multiplication(num1, num2);
        } 
        else if(operation.toLowerCase().equals("division")){
                result = calculator.division(num1, num2);
        }

            System.out.println("Your result is: "+ result);
        }
     }
        
