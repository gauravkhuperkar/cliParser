import annotations.FirstTask;
import annotations.SecondTask;
import annotations.ThirdTask;

public class Foo {

    public Foo() {
    }

    @FirstTask(value = "hii_1")
    public void executeFirstTask() {
        System.out.println("My FIRST task is executing with value > ");
    }

    @SecondTask(value = "hii_2")
    public void executeSecondTask(String value) {
        System.out.println("My SECOND task is executing with value > " + value);
    }

    @ThirdTask(value = "hii_3")
    public void executeThirdTask(String value) {
        System.out.println("My THIRD task is executing with value > " + value);
    }
}
