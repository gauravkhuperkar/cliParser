import annotations.*;

public class Foo {

    public Foo() {
    }

    @FirstTask(value = "hii_1")
    public void executeFirstTask(@FirstParam(value = "1st_param") String value) {
        System.out.println("My FIRST task is executing with value > " + value);
    }

    @SecondTask(value = "hii_2")
    public void executeSecondTask(@SecondParam(value = "2nd_param") String value) {
        System.out.println("My SECOND task is executing with value > " + value);
    }

    @ThirdTask(value = "hii_3")
    public void executeThirdTask(@ThirdParam(value = "3rd_param") String value) {
        System.out.println("My THIRD task is executing with value > " + value);
    }
}
