package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private Printer p = new Printer();
    private java.util.concurrent.locks.Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Main();
    }

    Main() {
        List<Thread> a = new ArrayList<>(10);
        for (int i = 0; i < 4; i++) {
            String s = "MyThread" + i;
            a.add(new Thread(() -> {
//                synchronized (p) {
                try{
                    lock.tryLock(10, TimeUnit.SECONDS);
                    p.render("------" + s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }, s));
        }
        a.forEach((t) -> t.start());
    }

}
