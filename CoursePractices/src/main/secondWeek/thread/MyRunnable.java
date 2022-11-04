package main.secondWeek.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
    }
}
