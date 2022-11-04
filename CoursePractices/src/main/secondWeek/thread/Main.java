package main.secondWeek.thread;

public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        Thread t3 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        t3.start();
    }
}
