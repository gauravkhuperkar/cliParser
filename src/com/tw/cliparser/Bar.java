package com.tw.cliparser;

import annotations.Command;
import annotations.Execute;

@Command(name = "bar")
public class Bar {

    public Bar() {
    }

    @Execute(text = "first")
    public void firstTask() {
        System.out.println("My FIRST task is executing in BAR..");
    }

    @Execute(text = "second")
    public void secondTask() {
        System.out.println("My SECOND task is executing in BAR..");
    }

    @Execute(text = "third")
    public void executeThirdTask() {
        System.out.println("My THIRD task is executing in BAR..");
    }
}
