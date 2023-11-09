package com.scaler.program2;

public class Main {

    public static void main(String[] args) {

        System.out.println("I am taking a MC "+ Thread.currentThread().getName());
        System.out.println("Hihihihihihi "+ Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        System.out.println("Hifhjhxwiugiwgbq "+ Thread.currentThread().getName());
    }
}

// 1. From the point where you want to start that task in parallel:
//     a. Create an object of that task
//     b. Create an object of a thread by giving the task to it
//     c. Start the thread