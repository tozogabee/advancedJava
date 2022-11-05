package main.secondWeek.thread;

import java.util.List;

public class RemoveThread extends Thread{

    private StringStore stringStore;

    public RemoveThread(StringStore stringStore) {
        this.stringStore = stringStore;
    }

    @Override
    public void run() {
        while (true) {
            List<String> stringList = this.stringStore.getStringList();
            int size = stringList.size();
            String lastStr = null;
            if(stringList.size() > 0){
                lastStr = stringList.get(0);
                try {
                    this.stringStore.remove(lastStr);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("REMOVE:: "+Thread.currentThread().getName()+" - "+lastStr);
            }

        }
    }
}
