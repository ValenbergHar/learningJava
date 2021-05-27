package com.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    private BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

    public Main() {
        new Thread(() -> {
            long id = 0;
            while (true) {
                try {
                    queue.put("Hello" + (id++));
                    System.out.println("Producer " + id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                    String s = queue.take();
                    System.out.println("Consumer " + s);
                    TimeUnit.MILLISECONDS.sleep((long) (Math.random() + 200));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
