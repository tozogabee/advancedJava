package main.secondWeek.thread;

public class Main {

    public static void main(String[] args) {
        StringStore stringStore = new StringStore();
        System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
        SimpleThread t1 = new SimpleThread();
        SimpleThread t2 = new SimpleThread();
        AddThread a1 = new AddThread(stringStore);
        AddThread a2 = new AddThread(stringStore);
        RemoveThread r1 = new RemoveThread(stringStore);
        RemoveThread r2 = new RemoveThread(stringStore);
        RemoveThread r3 = new RemoveThread(stringStore);
        Thread t3 = new Thread(new MyRunnable());
        Runnable newRunnable = () -> System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
        Thread t4 = new Thread(newRunnable);
        a1.start();
        a2.start();
        r1.start();
        r2.start();
        r3.start();
    }
}
