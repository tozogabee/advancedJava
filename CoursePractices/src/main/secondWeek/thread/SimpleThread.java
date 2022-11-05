package main.secondWeek.thread;

public class SimpleThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
    }
}
