package com.deved.practice.main;

import com.deved.practice.lambda1.Lambda1;
import com.deved.practice.lambda1.Lambda2;
import com.deved.practice.lambda1.LambdaCalc;


public class LaunchDemo {
    public static void main(String[] args) {
        // Define a lambda expression for Lambda1
        Lambda1 test = a -> System.out.println("This is the anonymous function 1: " + a);

        // Invoke the Lambda1 lambda
        test.someMethod("Hello");

        // Define a lambda expression for Lambda2
        Lambda2 test1 = () -> System.out.println("No parameter Anonymous function");

        // Invoke the Lambda2 lambda
        test1.someMethod();

        // Invoke the LambdaCalc lambda
        LambdaCalc test3 = (i, j) -> {
            int result = i * j;
            System.out.println("The calculation is: " + result);
        };

        test3.someMethod(3, 5);
    }
}

