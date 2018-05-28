package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

public class Tablet extends Observable{
    public static Logger logger = Logger.getLogger(Tablet.class.getName());

    final int number;
    private LinkedBlockingQueue queue = new LinkedBlockingQueue();

    public Tablet(int tablet) {
        this.number = tablet;
    }

    public void setQueue(LinkedBlockingQueue queue){
        this.queue = queue;
    }

    public Order createOrder()
    {
        Order order = null;
        try {
            order = new Order(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!order.isEmpty()) {
            ConsoleHelper.writeMessage(order.toString());
            setChanged();
            notifyObservers(order);
        }
    return order;
    }


    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
