package com.gyb;

import java.io.File;

/**
 * @Author gb
 * @Date 2020/10/8 19:50
 * @Version 1.0
 * description:删除文件名重复的文件，删除文件较小的
 */

public class Main {
    public static void main(String[] args) {
        String musicFile = "D:\\Demo1";
        File file = new File(musicFile);
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            for (int y = i + 1; y < list.length; y++) {
                if (list[i].split("\\.")[0].equals(list[y].split("\\.")[0])) {
                    if (list[i].length() > list[y].length() || list[i].length() == list[y].length()) {
                        new File(file.getParent() + "\\" + file.getName() + "\\" + list[y]).delete();
                    } else if (list[i].length() < list[y].length()) {
                        new File(file.getParent() + "\\" + file.getName() + "\\" + list[i]).delete();
                    }
                }
            }
        }
    }

}
