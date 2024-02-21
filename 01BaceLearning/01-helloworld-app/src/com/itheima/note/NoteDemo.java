package com.itheima.note;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
    目标：学习注释的使用
    这个程序就是讲解注释的
 */
public class NoteDemo {
    public static void main(String[] args) {
        // 我准备打印一行内容到控制台，我很开心
        System.out.println("我开始学习Java程序，感觉很哈皮~~~");
        System.out.println("/*\n" +
                "    目标：学习注释的使用\n" +
                "    这个程序就是讲解注释的\n" +
                " */");
        // 获取当前时间
        LocalDateTime currentDateTime = LocalDateTime.now();

        // 创建一个格式器用于格式化时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化并打印当前时间
        System.out.println(currentDateTime.format(formatter));
        /*
            窗前明月光
            疑是地上霜
            举头望明月
            低头想姑娘
         */
        System.out.println("波仔");
        System.out.println("Dlei");
        System.out.println("Dlei");
    }
}
