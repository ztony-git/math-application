package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 49_000;
        int garySalary = 62_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        double carPrice = 1299.99;
        double truckPrice = 1899.99;
        double cheapestVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest vehicle is: " + cheapestVehicle);

        double circleRadius = 7.5;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("The circle area is: " + circleArea);

        double num = 5.0;
        double sqrt = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + sqrt);
    }
}
