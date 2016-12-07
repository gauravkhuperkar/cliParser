import annotations.Command;
import annotations.Execute;
import com.tw.cliparser.Foo;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class Parser {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        System.out.println(args[0]+" "+args[1]);

        Reflections reflections = new Reflections("com.tw.cliparser", new SubTypesScanner(false), new TypeAnnotationsScanner());
        Set<Class<?>> allClass = reflections.getSubTypesOf(Object.class);

        for (Class clazz : allClass) {
            Command annotation = (Command) clazz.getAnnotation(Command.class);

            if(args[0].equals(annotation.name())){
                Method[] methods = clazz.getMethods();

                for (Method method:methods) {
                    Execute anno = method.getAnnotation(Execute.class);

                    if (anno != null) {
                        if(args[1].equals(anno.text())) {
                            method.invoke(clazz.newInstance());
                        }
                    }
                }
            }

        }
    }
}
