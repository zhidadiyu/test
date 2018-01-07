/**
 * Project Name:homework
 * File Name:Readthefolder.java
 * Package Name:test.Z2018_1_7
 * Date:2018年1月7日下午7:35:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package test.Z2018_1_7;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午7:35:49 <br/>
 * @author   Zhengheyang
 * @version
 * @see
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readthefolder {
    public static void copy1() throws IOException {
        // 选择要copy到的地址
        FileWriter file1 = new FileWriter("D:\\javacode\\CzF2.java");
        // 选择读取文件地址
        FileReader file2 = new FileReader("D:\\javacode\\CzF1.java");
        int i = 0;
        while ((i = file2.read()) != -1) {// 开始读取file2里面的字符
            file1.write(i);// 每读取一个，在file文件里写一个
        }
        file1.close();
        file2.close();
        // 最后刷新并关闭
    }

    public static void main(String[] args) throws IOException {
        copy1();// 最后输出copy1方法
    }
}
