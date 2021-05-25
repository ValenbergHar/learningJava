package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println("---object created---");
//        try {
//            o.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---closing---");
    }
}
