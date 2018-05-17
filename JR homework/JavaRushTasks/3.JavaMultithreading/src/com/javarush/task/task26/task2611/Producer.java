package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap map) {
        this.map = map;
    }

    @Override
    public void run() {
        AtomicInteger i = new AtomicInteger(1);
        while (true) {
            map.put(i.toString(),"Some text for "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("["+Thread.currentThread().getName()+"]"+" thread was terminated");
            }
            i.incrementAndGet();
        }

    }
}
