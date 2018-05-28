package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

public class Waiter implements Observer {
    private boolean busy;
    private LinkedBlockingQueue<Order> readyOrders;

    public boolean isBusy() {
        return busy;
    }

    public void setReadyOrders(LinkedBlockingQueue<Order> readyOrders) {
        this.readyOrders = readyOrders;
    }



    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(arg + " was cooked by " + o);
    }
}
