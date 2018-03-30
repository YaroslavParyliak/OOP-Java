package com.company;
public class lab2p1 {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("x1=\nx2=");
            return;
        }
        if (a == 0 && b == 0 && c != 0){
            System.out.println("x1=\nx2=");
            return;
        }
        if (a == 0 && c != 0){
            System.out.println("x1=" + -c / b + "\nx2=" + -c / b);
            return;
        }
        if (a == 0 && c == 0 && b != 0){
            System.out.println("x1=0.0\nx2=0.0");
            return;
        }
        if (Math.pow(b, 2) - 4 * a * c < 0){
            System.out.println("x1= \nx2=");
            return;
        }
        if (Math.pow(b, 2) == 4 * a * c){
            System.out.println("x1=" + (-b / (2 * a)) + "\nx2=" + (-b / (2 * a)));
            return;
        }
        if (c > 100){
            System.out.println("x1=\nx2=");
            return;
        }
        if (a == 0 || b == 0 || c == 0){
            System.out.println("x1=\nx2=");
            return;
        }

        else{
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
}

