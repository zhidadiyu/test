/**
 * Project Name:homework
 * File Name:DateText.java
 * Package Name:test.Z2018_1_7
 * Date:2018年1月7日下午7:56:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package test.Z2018_1_7;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午7:56:43 <br/>
 * @author   Zhengheyang
 * @version
 * @see
 */
//import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateText {
    private final static Logger LOG = LoggerFactory.getLogger(DateText.class);

    public static void main(String[] args) throws Exception {
        Long start = System.currentTimeMillis();
        Date date = new Date();
        String str = date.toString();
        System.out.println(str);
        Long end = System.currentTimeMillis();
        System.out.println("程序耗费的时间是： " + (end - start) + " 毫秒");
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String date1 = sdf1.format(new Date());
        System.out.println(date1);
    }
}
