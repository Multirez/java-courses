package ru.lesson.lessons;

import java.util.Scanner;

/**
 * Works with calculator object, supports console user input.
 * Created by Mult on 27.04.2017.
 */
public class InteractRunner {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String input = "";
            while(!input.equals("y")){
                System.out.println("Enter first arg:");
                String first = reader.next();
                System.out.println("Enter second arg:");
                String second = reader.next();
                calc.Sum(Float.valueOf(first), Float.valueOf(second));
                System.out.println("Result is: " + calc.GetResult());
                System.out.println("Type 'y' for another action, or exit:");
                input = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}
