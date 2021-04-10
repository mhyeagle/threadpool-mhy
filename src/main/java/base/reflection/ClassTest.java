package base.reflection;

public class ClassTest {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.Thread");
            System.out.println(cls.getCanonicalName());
//            System.out.println(cls.getClassLoader().toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
