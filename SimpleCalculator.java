package com.company;

import java.util.Scanner;

public class SimpleCalculator {
    public static void Sub( double a, double b)
    {
        if(a>b){
            double result = a-b;
            System.out.println("Subtraction : "+result);
        }
        else
        {
            double result2 = b-a;
            System.out.println("Subtraction : "+result2);
        }
    }

    public static void Add(double a, double b)
    {
        double result =a+b;
        System.out.println("Sum :"+result);
    }

    public static void Mul(double x, double y)
    {
        double result =x*y;
        System.out.println("Mul :"+result);
    }

    public static void Div( double a, double b)
    {
        double result = a / b;
        System.out.println("Div :"+result);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double c,d;
        System.out.print("Please Enter Your First Number : ");
        c = input.nextDouble();

        System.out.print("Please Enter Your First Number : ");
        d = input.nextDouble();

        System.out.print("Please Enter Your Arithmetic Operators : ");
        char ch = input.next().charAt(0);

        switch(ch)
        {
            case '+':
                Add(c,d);
                break;

            case '-':
                Sub(c,d);
                break;
            case '*':
                Mul(c,d);
                break;
            case '/':
                Div(c,d);
                break;


            default:
                break;


        }


    }
}
