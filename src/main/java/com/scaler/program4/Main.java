package com.scaler.program4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 10000; ++i) {

            if (i == 501) {
                System.out.println("STOP");
            }
            NumberPrinter np = new NumberPrinter(i);
            executors.execute(np);
            Thread.sleep(1L);
        }

    }
}
