package com.company.reflection;

public class Cat {
    private int privateField;
    int defaultField;
    public int publicField;

    public Cat(int privateField, int defaultField, int publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.publicField = publicField;
    }

    public Cat() {
    }

    public void publicMeow() {
        System.out.println("public meow");
    }

    private void privateMeow() {
        System.out.println("private meow");
    }

    public static void publicStaticMoew(){
        System.out.println("static meow");
    }


}
