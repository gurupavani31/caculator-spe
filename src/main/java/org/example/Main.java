package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Enter First Number :");
        double a = sc.nextDouble();

        System.out.println("Enter Second Number :");
        double b = sc.nextDouble();

        System.out.println("Enter Choice :\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n"
//                +
//                "5. SquareRoot\n" +
//                "6. Factorial\n"
        );
        int ch = sc.nextInt();

        String res = "";

        switch (ch){
            case 1: res = c.addition(a,b);break;
            case 2: res = c.subtraction(a,b);break;
            case 3: res = c.multiplication(a,b);break;
            case 4: res = c.division(a,b);break;
//            case 5: res = c.squareRoot(a);break;
//            case 6: res = c.factorial(Math.round(a));break;
            default:break;
        }
        System.out.println(res);
    }
}