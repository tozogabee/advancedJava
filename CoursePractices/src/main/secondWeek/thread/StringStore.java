package main.secondWeek.thread;

import java.util.ArrayList;
import java.util.List;

public class StringStore {

    private static final int MAX_SIZE = 10;
    final List<String> stringList = new ArrayList<>(MAX_SIZE);

    public synchronized void add(String s) throws InterruptedException {
        while(stringList.size() >= MAX_SIZE)
            wait();
        stringList.add(s);

        notifyAll();
    }

    public synchronized void remove(String s) throws InterruptedException {
        while(stringList.isEmpty())
            wait();
        stringList.remove(s);

        notifyAll();
    }

    public List<String> getStringList() {
        return stringList;
    }
}
