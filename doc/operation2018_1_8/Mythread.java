import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Mythread implements Runnable {
    private final static Logger LOG = LoggerFactory.getLogger(Demo1.class);

	
	public void run()  {
		try{
			LOG.info("线程正在运行：");
			Thread.sleep(500);
			LOG.info("线程在500毫秒后进入休眠!");
		}catch (InterruptedException IE) {
		    LOG.info("线程被中断!");
		}
	}
	

	public static void main(String[] args){
		Thread t = new Thread(new Mythread());
		LOG.info("线程为T为新建！");
		t.start();
		LOG.info("线程T为就绪！");
	}
}