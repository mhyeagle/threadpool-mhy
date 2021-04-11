package base.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.Thread");
            System.out.println(cls.getCanonicalName());
//            System.out.println(cls.getClassLoader().toString());
            Method nextThreadNum = cls.getDeclaredMethod("nextThreadNum", null);
            nextThreadNum.setAccessible(true);
            int nextThreadId = (int)nextThreadNum.invoke(null, null);
            nextThreadId = (int)nextThreadNum.invoke(null, null);
            System.out.println("nextThreadId:" + nextThreadId);

            Thread childThread = (Thread) cls.newInstance();
            System.out.println("getClass: " + childThread.getClass().toString());
            System.out.println("childThreadId:" + childThread.getId());
            if (childThread instanceof Thread) {
                System.out.println("childThread is instance of Thread");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
