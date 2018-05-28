package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Observer {
    private LinkedBlockingQueue<Order> queue;
    String name;
    private boolean busy = false;
    private volatile boolean caught = false;
    protected List<Dish> dishes;

    public Cook(String name) {
        this.name = name;
    }

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public boolean isBusy() {
        return busy;
    }

    @Override
    public String toString() {
        return name;
    }

    public void startCookingOrder(Order order) {
        busy = true;
        ConsoleHelper.writeMessage("Start cooking - " + order);
        Order order1 = (Order) order;
        String tabletName = order1.getTablet().toString();
        String cookName = name;
        int cookingTimeSeconds = order1.getTotalCookingTime();
        List<Dish> cookingDishs = order1.getDishes();

        setChanged();
        notifyObservers(order);
        try {
            Thread.sleep(order1.getTotalCookingTime() * 10);
        } catch (InterruptedException e) {
        }
        busy = false;
    }

    public int getTotalCookingTime() {
        int totalTime = 0;
        for (Dish dish : dishes)
            totalTime += dish.getDuration();
        return totalTime;
    }

    @Override
    public void update(Observable o, Object arg) {
            Order order = (Order)arg;
            ConsoleHelper.writeMessage("Start cooking - " + order+ ", cooking time " + order.getTotalCookingTime() + "min");
            setChanged();
            notifyObservers(arg);

        
    }
}
