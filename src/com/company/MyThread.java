package com.company;

public class MyThread extends Thread{


    public MyThread(String threadName, ThreadGroup threadGroup) {
        super(threadGroup, threadName);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Thread " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
