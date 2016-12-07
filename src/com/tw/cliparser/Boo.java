package com.tw.cliparser;

import annotations.Command;
import annotations.Execute;

@Command(name = "boo")
public class Boo {

    public Boo() {
    }

    @Execute(text = "first")
    public void firstTask() {
        System.out.println("My FIRST task is executing in BOO..");
    }

    @Execute(text = "second")
    public void secondTask() {
        System.out.println("My SECOND task is executing in BOO..");
    }

    @Execute(text = "third")
    public void executeThirdTask() {
        System.out.println("My THIRD task is executing in BOO..");
    }
}
