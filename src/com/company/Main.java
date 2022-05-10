package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle triangle = new Triangle();
        triangle.a = 5;
        triangle.b = 6;
        triangle.c = 7;
        System.out.println("this is triangle^s area ");
        triangle.area();
    }
}
