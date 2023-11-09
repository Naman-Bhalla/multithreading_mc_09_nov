package com.scaler.program3;

public class Main {

    public static void main(String[] args) {
//        NumberPrinter np1 = new NumberPrinter(1);
//        Thread t1 = new Thread(np1);
//        t1.start();
//
//        NumberPrinter np2 = new NumberPrinter(2);
//        Thread t2 = new Thread(np2);
//        t2.start();

        for (int i = 1; i <= 100; ++i) {
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }
    }
}
