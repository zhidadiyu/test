import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TestDemo {
    
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        
    }
}
