package tempconverter;

import java.util.Scanner;

public class tempConverter{
    public static double toCelsius(double temp){
        return (temp - 32) * 5/9;
    }

    public static double toFarenheit(double temp){
        return (temp * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter temprature: " );
        double temp = input.nextDouble();

        input.nextLine();

        System.out.println("Please enter type you'd like to convert to, (C) or (F): ");
        String type = input.nextLine();

        if(type.toLowerCase().equals("c")){
            System.out.println(temp + " farenheit is equivalent to " + toCelsius(temp) + " Celsius.");
        }else if(type.toLowerCase().equals("f")){
            System.out.println(temp + " celsius is equivalent to " + toFarenheit(temp) + " Farehneit.");
        }

    }
}