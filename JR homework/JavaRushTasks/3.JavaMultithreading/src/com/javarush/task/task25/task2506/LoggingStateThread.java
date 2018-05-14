package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread watchingThread;

    public LoggingStateThread(Thread watchingThread) {
        this.watchingThread = watchingThread;
        this.setDaemon(true);
    }

    @Override
    public void run() {
        State state = watchingThread.getState();
        System.out.println(state);
        while (true) {
            if (state != watchingThread.getState()) {
                state = watchingThread.getState();
                System.out.println(state);
                if (state == State.TERMINATED) {
                    break;
                }
            }
        }

    }
}
