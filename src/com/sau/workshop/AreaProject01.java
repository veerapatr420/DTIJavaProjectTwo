package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class AreaProject01 {
    public static void main(String[] args) {
        double width,longs,base,high,radius;
        double areaSquare,areaTriangle,areaCircle;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int menu;

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("      Shape Area Program");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3.Circle Area");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.print("Select menu: ");
        menu = sc.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++");
        switch (menu){
            case 1:
                System.out.print("Input width: ");
                width = sc.nextDouble();
                System.out.print("Input long: ");
                longs = sc.nextDouble();
                areaSquare = width * longs;
                System.out.println("Area of Square is " +areaSquare );
                break;
            case 2:
                System.out.print("Input base: ");
                base = sc.nextDouble();
                System.out.print("Input longs: ");
                longs = sc.nextDouble();
                areaTriangle = base * longs / 2 ;
                System.out.println("Area of Triangle is " + areaTriangle);
                break;
            case 3:
                System.out.print("Input radius: ");
                radius = sc.nextDouble();
                areaCircle = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Circle is " + areaCircle);
                break;
            default:
                System.out.println("Please Select menu");
                break;

        }

    }
}
