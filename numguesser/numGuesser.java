package numguesser;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class numGuesser{

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int counter = 0;

    System.out.print("Hello, please enter the max number: ");
    int max = input.nextInt();

    System.out.print("Hello, please enter the min number: ");
    int min = input.nextInt();


    int random = rand.nextInt(max - min + 1) + min; 

    System.out.print("The random number is between " + min + " and " + max + ", Please guess the number: ");
    int guess = input.nextInt();
    counter++;

    while(guess != random){
        if(guess < random ){
            System.out.println("Oops, too low please try again.");
        }else if(guess > random){
            System.out.println("Oops, too high please try again. ");
        }
        System.out.print("The random number is between " + min + " and " + max + ", Please guess the number: ");
        guess = input.nextInt();
        counter++;

    }

    System.out.println("Congratulations you got it! It took you: " + counter + " tries!");

    }
}