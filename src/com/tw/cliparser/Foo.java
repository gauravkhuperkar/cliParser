package com.tw.cliparser;

import com.tw.cliparser.annotations.Command;
import com.tw.cliparser.annotations.Execute;

@Command(name = "foo")
public class Foo {

    public Foo() {}

    @Execute(text = "first")
    public void firstTask(String value) {
        System.out.println("My FIRST task is executing in FOO.. with value " + value);
    }

    @Execute(text = "second")
    public void secondTask(String value) {
        System.out.println("My SECOND task is executing in FOO.. with value " + value);
    }

    @Execute(text = "third")
    public void executeThirdTask(String value) {
        System.out.println("My THIRD task is executing in FOO.. with value " + value);
    }
}
