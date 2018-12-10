package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    public boolean isAlive = true;
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private Direction direction = Direction.LEFT;

    public Snake(int x, int y) {
        for (int i = 0; i < 3; i++) {
            snakeParts.add(new GameObject(x+i,y));
        }
    }

    public void setDirection(Direction direction) {
        if (this.direction.getOpposite() != direction) {
            if (direction == Direction.LEFT && !(snakeParts.get(0).x == snakeParts.get(1).x)) {
                return;
            }
            if (direction == Direction.RIGHT && !(snakeParts.get(0).x == snakeParts.get(1).x)) {
                return;
            }
            if (direction == Direction.UP && !(snakeParts.get(0).y == snakeParts.get(1).y)) {
                return;
            }
            if (direction == Direction.DOWN && !(snakeParts.get(0).y == snakeParts.get(1).y)) {
                return;
            }
            this.direction = direction;
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x < 0 || newHead.y <0 || newHead.x >= SnakeGame.WIDTH || newHead.y >= SnakeGame.HEIGHT) {
         isAlive = false;
        } else {
            if (checkCollision(newHead) == false){
            snakeParts.add(0, newHead);
            if (newHead.x == apple.x && newHead.y == apple.y) {
                apple.isAlive = false;
            } else {
                removeTail();
            }} else {
                isAlive = false;
            }
        }
    }

    public void draw(Game game) {
        boolean head = true;
        for (GameObject go:snakeParts) {
            game.setCellValueEx(go.x, go.y,Color.NONE, (head)?HEAD_SIGN:BODY_SIGN,(isAlive)? Color.BLACK:Color.RED,75);
            head = false;
        }
    }

    public GameObject createNewHead() {
        int head_x = snakeParts.get(0).x;
        int head_y = snakeParts.get(0).y;
        switch (direction) {
            case UP:{
                return new GameObject(head_x, head_y-1);
            }
            case DOWN:{
                return new GameObject(head_x, head_y+1);
            }
            case LEFT:{
                return new GameObject(head_x-1, head_y);
            }
            case RIGHT:{
                return new GameObject(head_x+1, head_y);
            }
        }
        return null;
    }

    public  boolean checkCollision(GameObject gameObject) {
       boolean collision = false;
        for (GameObject go:snakeParts) {
            if (go.x == gameObject.x && go.y == gameObject.y) {
                collision = true;
            }
        }
       return collision;
    }

    public int  getLength() {
        return snakeParts.size();
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size()-1);
    }
}
