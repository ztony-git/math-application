package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 49_000;
        int garySalary = 62_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);
    }
}
