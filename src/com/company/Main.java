package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        ThreadGroup threadGroup = new ThreadGroup("Group");

        MyThread myThread = new MyThread("first", threadGroup);
        MyThread myThread1 = new MyThread("second", threadGroup);
        MyThread myThread2 = new MyThread("third", threadGroup);
        MyThread myThread3 = new MyThread("forth", threadGroup);

        myThread.start();
        Thread.sleep(1000);
        myThread1.start();
        Thread.sleep(1000);
        myThread2.start();
        Thread.sleep(1000);
        myThread3.start();
        Thread.sleep(1000);

        Thread.sleep(15000);
        threadGroup.interrupt();



    }
}
