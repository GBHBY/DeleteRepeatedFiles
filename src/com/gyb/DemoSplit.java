package com.gyb;

import java.io.File;

/**
 * @Author gb
 * @Date 2020/10/8 21:30
 * @Version 1.0
 * description:测试
 */

public class DemoSplit {
    public static void main(String[] args) {
        File file = new File("D:\\Demo\\李宗盛 - 我是一只小小鸟 (Live).flac");

        File file2 = new File(file.getParent());
        System.out.println(file.getParent()+"\\"+"213");

    }
}
