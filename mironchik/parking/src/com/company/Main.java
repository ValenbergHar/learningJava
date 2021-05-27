package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class Main {

    //    private int next = 0;
    private AtomicInteger next = new AtomicInteger(0);

    public static void main(String[] args) {
        new Main();
    }

    Main() {
        // write your code here
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("------" + Thread.currentThread().getName() + " " + next.get());
                LockSupport.park();
            }
        }, "Zhyvie");
        t.start();

        Thread tm = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    LockSupport.unpark(t);
                    next.incrementAndGet();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Amap");
        tm.start();
    }

}
