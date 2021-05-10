package train;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Train {

    public static void main(String[] args) {
        byte a= 3;
        byte b = 4;
        a+=b;
        Class c1 = String.class;
        System.err.println(c1.getName());
        System.err.println(c1.getSimpleName());
        Method[] m1 = c1.getMethods();
        Field[] f1 = c1.getFields();
        System.err.println("====method");
        for (Method m : m1) {
            System.err.println("====");
            System.err.println(m.getName());
            for (Class c2 : m.getParameterTypes()) {
                System.err.println(c2.getName());
            }
        }
        System.err.println("=====field");
        for (Field f:f1){
            System.err.println(f.getName()+"==="+f.getType().getName()
            );
        }
    }
}
