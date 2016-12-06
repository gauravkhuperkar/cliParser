import annotations.FirstTask;
import annotations.SecondTask;

import java.lang.reflect.Method;

public class Parser {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(args[0]);
        System.out.println(args[1]);

        Foo foo = new Foo();

        System.out.println(foo.getClass().getMethod("executeFirstTask").getAnnotation(FirstTask.class).value());

    }
}
