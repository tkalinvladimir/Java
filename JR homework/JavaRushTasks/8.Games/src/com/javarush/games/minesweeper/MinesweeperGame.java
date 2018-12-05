package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private boolean isGameStopped;
    private int countClosedTiles = SIDE*SIDE;
    private int score;

    private void createGame(){
        for (int i= 0; i <SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellValue(j, i, "");
                boolean isMine = false;
                if (getRandomNumber(10) == 1) {
                    isMine = true;
                    countMinesOnField++;
                }

                gameField[j][i] = new GameObject(i, j, isMine);
                setCellColor(j, i, Color.ORANGE);

            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }


    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> neighboors = new ArrayList<GameObject>();

        for (int x = gameObject.x-1; x <= gameObject.x+1; x++) {
            for (int y = gameObject.y-1; y <= gameObject.y+1; y++) {
                if ((!((x == gameObject.x) && (y == gameObject.y))) && ( x >= 0) && ( x < gameField.length) && (y >= 0) && (y < gameField.length))
                {
                    neighboors.add(gameField[y][x]);
                }
            }
        }

        return neighboors;
    }

    private void countMineNeighbors() {
        for (int i= 0; i <SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                GameObject gameObject = gameField[j][i];
                int countMines = 0;
                if (!gameObject.isMine) {
                    for (GameObject go : getNeighbors(gameObject)) {
                        if (go.isMine) {
                            countMines++;
                        }
                    }
                    gameObject.countMineNeighbors = countMines;
                }
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject tmp_go = gameField[x][y];
        if (tmp_go.isOpen || tmp_go.isFlag || isGameStopped) {
            return;
        }
        tmp_go.isOpen = true;
        countClosedTiles--;

        if (tmp_go.isMine) {
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else {
            score = score+5;
            setScore(score);
            if (tmp_go.countMineNeighbors == 0) {
                setCellValue(x, y, "");
                for (GameObject go:getNeighbors(tmp_go)) {
                    if (!go.isOpen) {
                        openTile(go.y, go.x);
                    }
                }
            } else {
                setCellNumber(x, y, tmp_go.countMineNeighbors);
            }
            if (countClosedTiles == countMinesOnField) {
                win();
            }
        }
        setCellColor(x, y, Color.GREEN);

    }

    private void markTile (int x, int y) {
        GameObject go = gameField[x][y];
        if (isGameStopped) {
            return;
        }
        if (go.isOpen) {
            return;
        }
        if (!go.isFlag && countFlags == 0) {
            return;
        }

        if (!go.isFlag) {
            go.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.YELLOW);

        } else if (go.isFlag) {
            go.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.ORANGE);
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "Game over", Color.RED, 1);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "Game over", Color.GREEN, 1);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
        } else {
            openTile(x, y);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void restart() {
        isGameStopped = false;
        score = 0;
        countClosedTiles = SIDE*SIDE;
        countFlags = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();
    }
}
