package com.company;

public class MainWait {
    public static void main(String[] args) {
        Object o = new Object();
        synchronized (o) {
            try {
                o.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
