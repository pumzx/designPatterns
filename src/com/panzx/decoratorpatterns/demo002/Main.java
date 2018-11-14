package com.panzx.decoratorpatterns.demo002;

import java.io.*;

/**
 *
 * 测试文件装饰器模式
 *
 * @author panzhixiong
 * @date 2018/11/15
 */
public class Main {
    public static void main(String[] args) {
        // in:Hello,Decorator!
        // out:hello,decorator!
        int c;
        InputStream inputStream = null;
        try {
            // FileInputStream相当于组件，继承于抽象类InputStream
            // BufferedInputStream和LowerCaseInputStream是装饰器，继承于抽象的装饰器类FilterInputStream
            // 理所当然，FilterInputStream是继承于InputStream
            inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
