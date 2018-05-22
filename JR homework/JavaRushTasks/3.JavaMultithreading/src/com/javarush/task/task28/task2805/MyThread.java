package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    static AtomicInteger currentPriority = new AtomicInteger(0);

    private void initializePriority() {
        currentPriority.incrementAndGet();
        currentPriority.compareAndSet(11, 1);

        int newPriority = currentPriority.get();

        setPriority(newPriority);
    }

    public MyThread() {
        initializePriority();
    }

    public MyThread(Runnable target) {
        super(target);
        initializePriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        initializePriority();
    }

    public MyThread(String name) {
        super(name);
        initializePriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        initializePriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        initializePriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        initializePriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        initializePriority();
    }
}
