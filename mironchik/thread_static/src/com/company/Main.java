package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Thread> a = new ArrayList<>(10);
        for (int i = 0; i < 4; i++) {
            String s = "MyThread" + i;
            a.add(new Thread(() -> {
                Printer.render("------" + s);
            }, s));
        }
        a.forEach((t) -> t.start());
    }
}
