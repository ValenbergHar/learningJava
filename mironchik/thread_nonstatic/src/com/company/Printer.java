package com.company;

import java.util.concurrent.TimeUnit;

public class Printer {
    public void render(String text){
        try {
            TimeUnit.MILLISECONDS.sleep((long)((Math.random()*200)));
            System.out.println("");
            TimeUnit.MILLISECONDS.sleep((long)((Math.random()*200)));
            System.out.println("[ " + Thread.currentThread().getName());
            TimeUnit.MILLISECONDS.sleep((long)((Math.random()*200)));
            System.out.println(text + " " + Thread.currentThread().getName());
            TimeUnit.MILLISECONDS.sleep((long)((Math.random()*200)));
            System.out.println( "] " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
