package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {

    private static final int ORDER_CREATING_INTERVAL = 100;
    private static final LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws IOException {
        Cook cook = new Cook("Amigo");
        Tablet tablet = new Tablet(5);
        Waiter waitor = new Waiter();

        cook.addObserver(waitor);
        tablet.addObserver(cook);
        tablet.createOrder();

    }
}
