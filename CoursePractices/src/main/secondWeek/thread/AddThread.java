package main.secondWeek.thread;

public class AddThread extends Thread{

    private StringStore stringStore;

    public AddThread(StringStore stringStore) {
        this.stringStore = stringStore;
    }

    @Override
    public void run() {
        while(true) {
            String randomNumStr = String.valueOf(Math.random());
            try {
                stringStore.add(randomNumStr);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ADD:: "+Thread.currentThread().getName() + randomNumStr);
        }
    }
}
