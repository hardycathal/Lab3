package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        add();
        multiply();
        divide();
        subtract();
    }

    private static void subtract() {
        System.out.println("\nSubtraction");
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please Enter your second number : ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }

    private static void divide() {
        System.out.println("\nDivision");
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        float firstNumber = inputs.nextInt();

        System.out.println("Please Enter your second number : ");
        float secondNumber = inputs.nextInt();

        float total = firstNumber / secondNumber;
        System.out.println("The total is " + total);
    }

    private static void multiply() {
        System.out.println("\nMultiplication");
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please Enter your second number : ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }

    public static void add() {
        System.out.println("Addition");
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

         System.out.println("Please Enter your second number : ");
         int secondNumber = inputs.nextInt();

         int total = firstNumber + secondNumber;
         System.out.println("The total is " + total);
    }
    public static void delete()
    {

    }
}

