/**
 * Project Name:homework
 * File Name:TestRedirecting.java
 * Package Name:
 * Date:2018年1月6日下午4:14:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description:   <br/>
 * Date:     2018年1月6日 下午4:14:46 <br/>
 * @author   Zhengheyang
 * @version
 * @see
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRedirecting {

    private final static Logger LOG = LoggerFactory.getLogger(TestRedirecting.class);

    public static void main(String[] args) throws IOException {
        String path = "D:\\Git_coid\\doc\\Vip1.java";
        File file = new File(path);

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] b = new byte[1024];
            int len = fis.read(b);
            while (len != -1) {
                String str = new String(b, 0, len);
                LOG.info(str);
                len = fis.read(b);
            }
        } catch (FileNotFoundException e) {
            LOG.info("ffff", e);
        } catch (IOException e) {
            LOG.info("IO", e);
        }
    }
}
