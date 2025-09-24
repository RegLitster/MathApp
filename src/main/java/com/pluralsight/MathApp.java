package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

// Question 1:
// declare variables here
    int bob_salary = 40000;
    int gary_salary = 60000;
    int highest_salary = Math.max(bob_salary, gary_salary);

    int truck_price = 80000;
    int car_price = 65000;

    int hour = 60;
    int day = 24 * hour;

// then code solution
    System.out.println("The highest salary is " + highest_salary);
    System.out.println("The smallest price is " + Math.min(truck_price, car_price));
    System.out.println(Math.pow(7.25, 2) * Math.PI);
    System.out.println(Math.sqrt(5.0));
    System.out.println(Math.abs(5-10));
    System.out.println(Math.abs(85-50));
    System.out.println(Math.abs(-3.8));
    System.out.println(Math.random());
    System.out.println(day * 24);




// then use System.out.println() to display results

// ex: System.out.println("The answer is " + answer);

// REPEAT FOR NEXT EXERCISE
    }
}