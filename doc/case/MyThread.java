import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

/**
 * Project Name:homework
 * File Name:MyThread.java
 * Package Name:
 * Date:2018年1月10日上午11:53:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月10日 上午11:53:30 <br/>
 * 
 * @author Zhengheyang
 * @version
 * @see
 * 
 */

class MyThread implements Runnable {
    private final static Logger LOG = (Logger) LoggerFactory.getLogger(MyThread.class);

    private int ticket = 10;

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            if (this.ticket > 0) {
                LOG.info("卖票,ticket = " + this.ticket);
            }
        }
    }
}
