package main.secondWeek.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
    }
}
