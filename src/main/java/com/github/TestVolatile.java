package com.github;

/**
 * Author:lorrie
 * Create:2019/3/19
 */

/*
虽然使用了volatile，但是没有保证原子性！！！！会不安全
 */
public class TestVolatile {

    public static  volatile int num=0;
    public static void increase(){
        num++;
    }

    public static void main(String[] args) {
        Thread[] thread = new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        increase();
                    }
                }
            });
            thread[i].start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(num);
    }
}

//双重检查的单例模式
class Singleton{
    private volatile static Singleton singleton=null;
    private Singleton(){}
    public static Singleton getInstance(){
        //因为不是原子操作，singleton=new Singleton();是三步，但是这三步的顺序不一定，先=null还是先new
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
