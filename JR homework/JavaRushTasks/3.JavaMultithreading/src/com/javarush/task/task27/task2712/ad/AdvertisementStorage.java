package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

class AdvertisementStorage {
    private static final AdvertisementStorage INSTANCE = new AdvertisementStorage();
    private final List<Object> videos = new ArrayList<>();

    private AdvertisementStorage() {
//		add(new Advertisement(new Object(), "First Video", 5000, 100, 3 * 60));
        add(new Advertisement(new Object(), "second Video", 100, 10, 25 * 60));
//		add(new Advertisement(new Object(), "Third Video", 400, 2, 10 * 60));
    }

    public static AdvertisementStorage getInstance() {
        return INSTANCE;
    }

    public List<Object> list() {
        return videos;
    }

    public void add(Advertisement advertisement) {
        videos.add(advertisement);
    }
}