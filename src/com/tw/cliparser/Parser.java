package com.tw.cliparser;

import com.tw.cliparser.annotations.Execute;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Parser {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println(args[0]);

        Foo foo = new Foo();
        Method[] methods = foo.getClass().getMethods();
        for (Method method:methods) {
            Execute annotation = method.getAnnotation(Execute.class);
            if (annotation != null) {
                if(args[0].equals(annotation.text())) {
                    method.invoke(foo,args[1]);
                }
            }
        }

    }
}
