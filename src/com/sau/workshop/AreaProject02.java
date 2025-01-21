package com.sau.workshop;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AreaProject02 {
    public static void main(String[] args) throws IOException {
        double width, length, base, height, radius;
        double areaSquare, areaTriangle, areaCircle;
        int menu;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("      Shape Area Program");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.print("Select menu: ");
        menu = Integer.parseInt(reader.readLine());  // แก้ไขที่นี่
        System.out.println("+++++++++++++++++++++++++++++++++");

        switch (menu) {
            case 1:
                System.out.print("Input width: ");
                width = Double.parseDouble(reader.readLine());
                System.out.print("Input length: ");
                length = Double.parseDouble(reader.readLine());
                areaSquare = width * length;
                System.out.println("Area of Square is " + areaSquare);
                break;
            case 2:
                System.out.print("Input base: ");
                base = Double.parseDouble(reader.readLine());
                System.out.print("Input height: ");
                height = Double.parseDouble(reader.readLine());
                areaTriangle = base * height / 2;
                System.out.println("Area of Triangle is " + areaTriangle);
                break;
            case 3:
                System.out.print("Input radius: ");
                radius = Double.parseDouble(reader.readLine());
                areaCircle = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Circle is " + areaCircle);
                break;
            default:
                System.out.println("Please Select menu");
                break;
        }
    }
}
