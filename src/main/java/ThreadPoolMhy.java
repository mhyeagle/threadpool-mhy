import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMhy {
    public static void main(String[] args) {
        System.out.println("-------------TadPoolMhy start now-------------");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
    }
}
