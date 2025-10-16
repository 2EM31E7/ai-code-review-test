package org.example.thread;

/**
 * @Author: Bach912
 * @Description: TODO
 * @DateTime: 2025/10/9 13:08
 **/
public class MyThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println(1);
        });
        Thread thread2 = new Thread(() -> {
            System.out.println(2);
        });
        Thread thread3 = new Thread(() -> {
            System.out.println(3);
        });
        thread3.setPriority(10);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
