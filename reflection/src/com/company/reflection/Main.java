package com.company.reflection;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, MalformedURLException, ClassNotFoundException {
//        System.out.println(Main.class.getName());
//        System.out.println(int[].class.getName());

        Class classCat = Cat.class;

        Method[] methods = classCat.getDeclaredMethods();
        for (Method o : methods) {
            System.out.println(o.getName());
        }


        Cat cat = new Cat(1, 2, 3);
        methods[0].invoke(cat);

        methods[1].setAccessible(true);
        methods[1].invoke(cat);

        methods[2].setAccessible(true);
        methods[2].invoke(cat);

        int mods = methods[2].getModifiers();
        System.out.println(mods);


        Field[] fields = classCat.getDeclaredFields();

        System.out.println(Arrays.toString(fields));
        System.out.println("fields[1].get(cat) - " + fields[1].get(cat));
        fields[1].set(cat, 20);
        System.out.println("fields[1].get(cat) - " + fields[1].get(cat));


        Cat cat1 = (Cat) classCat.newInstance();
        System.out.println(cat1);

        Cat cat2 = (Cat) classCat.getConstructor(int.class, int.class, int.class).newInstance(10, 20, 30);
        System.out.println(cat2);

//        ClassLoader classLoader = new URLClassLoader(new URL[]{new File("com\\company\\reflection").toURL()});
//        Class catClass = classLoader.loadClass("Cat");
//        Object catObject = catClass.getConstructor(int.class, int.class, int.class).newInstance(10, 20, 30);
//        Method publicMeowMethod = catClass.getDeclaredMethod("publicMeow");
//        publicMeowMethod.invoke(catObject);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Class testClass = TestClass.class;
        Method[] methods1 = testClass.getDeclaredMethods();
        List<Method> executionList = new ArrayList<>();

//        for (Method method : methods1) {
//            if (method.isAnnotationPresent(MyAnno.class)) {
//                executionList.add(method);
//            }
//        }
//        executionList.sort((o1, o2) -> o2.getAnnotation(MyAnno.class).priority() - o1.getAnnotation(MyAnno.class).priority());

        executionList = Arrays.stream(methods1)
                .filter(m -> m.isAnnotationPresent(MyAnno.class))
                .sorted((o1, o2) -> o2.getAnnotation(MyAnno.class).priority() - o1.getAnnotation(MyAnno.class).priority())
                .collect(Collectors.toList());
        for (Method m : executionList)
            m.invoke(null);

    }
}
