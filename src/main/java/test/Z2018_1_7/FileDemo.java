/**
 * Project Name:homework
 * File Name:FileDemo.java
 * Package Name:test.Z2018_1_7
 * Date:2018年1月7日下午8:01:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package test.Z2018_1_7;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午8:01:16 <br/>
 * @author   Zhengheyang
 * @version
 * @see
 */
import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileDemo {
    private final static Logger LOG = LoggerFactory.getLogger(FileDemo.class);

    public static void listDir(String path) {
        File file1 = new File(path);
        LOG.info("目录：" + file1.getAbsolutePath());
        String[] file2 = file1.list();
        for (String name : file2) {
            StringBuffer fullPath = new StringBuffer();
            fullPath.append(path);
            fullPath.append(File.separator);
            fullPath.append(name);
            File tmpFile = new File(fullPath.toString());

            if (tmpFile.isDirectory()) {

                listDir(tmpFile.toString());

            } else {
                LOG.info("文件：" + fullPath.toString());
            }
        }
    }

    public static void main(String[] args) {
        String path = "D:\\javacode\\copya";
        listDir(path);
    }
}
