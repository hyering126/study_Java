package week13.package_15;

import java.lang.reflect.*;;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;

        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParmeters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소듸 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(");
            Class[] parmeters = method.getParameterTypes();
            printParmeters(parmeters);
            System.out.println(")");
        }
    }

    private static void printParmeters(Class[] parmeters) {
        for (int i = 0; i < parmeters.length; i++) {
            System.out.println(parmeters[i].getName());
            if (i < (parmeters.length - 1)) {
                System.out.println(",");
            }
        }
    }
}
