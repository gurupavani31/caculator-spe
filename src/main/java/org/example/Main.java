package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Calculator c = new Calculator();



        System.out.println("Enter Choice :\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n"
                +
                "5. SquareRoot\n"
                        +
                "6. Factorial\n"
        );
        int ch = sc.nextInt();

        String res = "";
        double a,b;
        long d;

        switch (ch){
            case 1:
                System.out.println("Enter First Number :");
                a = sc.nextDouble();

                System.out.println("Enter Second Number :");
                b = sc.nextDouble();

                res = c.addition(a,b);
                break;
            case 2:
                System.out.println("Enter First Number :");
                a = sc.nextDouble();

                System.out.println("Enter Second Number :");
                b = sc.nextDouble();

                res = c.subtraction(a,b);
                break;
            case 3:
                System.out.println("Enter First Number :");
                a = sc.nextDouble();

                System.out.println("Enter Second Number :");
                b = sc.nextDouble();

                res = c.multiplication(a,b);
                break;
            case 4:
                System.out.println("Enter First Number :");
                a = sc.nextDouble();

                System.out.println("Enter Second Number :");
                b = sc.nextDouble();

                res = c.division(a,b);
                break;
            case 5:
                System.out.println("Enter the Number :");
                a = sc.nextFloat();

                res = c.squareRoot(a);
                break;
            case 6:
                System.out.println("Enter the Number :");
                d = sc.nextLong();

                res = c.factorial(d);
                break;
            default:break;
        }
        System.out.println("Result is : "+res);
    }
}