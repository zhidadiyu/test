/**
 * Project Name:homework
 * File Name:Multithreading.java
 * Package Name:test.Z2018_1_8
 * Date:2018年1月8日下午4:04:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package test.Z2018_1_8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:04:58 <br/>
 * 
 * @author Zhengheyang
 * @version
 * @see
 */
public class Multithreading implements Runnable {
    private final static Logger LOG = LoggerFactory.getLogger(Multithreading.class);

    long minPrime;

    void PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    @Override
    public void run() {
        LOG.info(" " + minPrime);
    }
}
