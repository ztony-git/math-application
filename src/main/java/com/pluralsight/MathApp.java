package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 49_000, garySalary = 62_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        double carPrice = 1299.99, truckPrice = 1899.99;
        double cheapestVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest vehicle is: " + cheapestVehicle);

        double circleRadius = 7.5;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("The circle area is: " + circleArea);

        double num = 5.0;
        double sqrt = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + sqrt);

        int x1 = 5, x2 = 85, y1 = 10, y2 = 50;
        double distance = Math.hypot(x2 - x1, y2 - y1);
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
    }
}
