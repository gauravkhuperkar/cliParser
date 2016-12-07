package com.tw.cliparser;

import annotations.Command;
import annotations.Execute;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Command(name = "foo")
public class Foo {

    public Foo() {}

    @Execute(text = "first")
    public void firstTask() {
        System.out.println("My FIRST task is executing in FOO.. ");
    }

    @Execute(text = "second")
    public void secondTask() {
        System.out.println("My SECOND task is executing in FOO..");
    }

    @Execute(text = "third")
    public void executeThirdTask() {
        System.out.println("My THIRD task is executing in FOO..");
    }
}
