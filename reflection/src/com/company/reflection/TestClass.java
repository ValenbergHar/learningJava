package com.company.reflection;

public class TestClass {

    @MyAnno(priority = 10)
    public static void method1() {
        System.out.println("method1");
    }

    @MyAnno(priority = 2)
    public static void method2() {
        System.out.println("method2");
    }

    @MyAnno(priority = 5)
    public static void method3() {
        System.out.println("method3");
    }
}
