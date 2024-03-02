package org.example;

public class Calculator {
    public String addition(double a, double b) {
        double ans = a + b;
        return Double.toString(ans);
    }

    public String subtraction(double a, double b) {
        double ans = a - b;
        return Double.toString(ans);
    }

    public String multiplication(double a, double b) {
        double ans = a * b;
        return Double.toString(ans);
    }

    public String division(double a, double b) {

        if(b == 0.0){
            return "Denominator cannot be '0.0'";
        }
        double ans = a / b;
        return Double.toString(ans);
    }

    public String squareRoot(double a) {
        if(a < 0.0) {
            return "Number cannot be negative for square root";
        }
        else {
            double ans = Math.sqrt(a);
            return Double.toString(ans);
        }
    }

//    public String factorial(long a) {
//        if (a < 0) {
//            return "Number cannot be negative for factorial";
//        } else {
//            long ans = 1;
//            for (long i = 2; i <= a; i++) {
//                ans *= i;
//            }
//            return Long.toString(ans);
//        }
//    }
}
