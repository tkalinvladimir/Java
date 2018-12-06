package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;

public class Game2048 extends Game{
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private  boolean isGameStopped = false;
    private int score;

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();

        drawScene();
    }
    private void createGame() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                gameField[x][y] = 0;
            }
        }
        score = 0;
        setScore(score);
        createNewNumber();
        createNewNumber();
    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048) {
            win();
        }
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int rand = getRandomNumber(10);
        if (rand < 9) {
            gameField[x][y] = 2;
        } else {
            gameField[x][y] = 4;
        }

    }

    private int getEmptyTilesCount() {
        int empty = 0;
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (gameField[x][y] == 0) {
                    empty++;
                }
            }
        }
        return empty;
    }

    private boolean canMerge() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE - 1; j++) {
                if (gameField[i][j] == gameField[i][j + 1]) {
                    return true;
                }
            }
        }
        for (int j = 0; j < SIDE; j++) {
            for (int i = 0; i < SIDE - 1; i++) {
                if (gameField[i][j] == gameField[i + 1][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean canUserMove() {
        if (getEmptyTilesCount() > 0 || canMerge())  {
            return true;
        }
        return false;
    }

    private void drawScene() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                setCellColoredNumber(y, x, gameField[x][y]);
            }
        }
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "WIN!", Color.BLACK, 10);
    }

    private boolean mergeRow(int[] row) {
        boolean changes = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && (row[i] == row[i + 1])) {
                score = score + row[i] + row[i + 1];
                setScore(score);
                row[i] = row[i] + row[i + 1];
                row[i + 1] = 0;
                changes = true;
            }
        }
        return changes;
    }

    private boolean compressRow(int[] row) {
        boolean changes = false;
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0 && i < row.length - 1 && row[i + 1] != 0) {
                int temp = row[i];
                row[i] = row[i + 1];
                row[i + 1] = temp;
                i = -1;
                changes = true;
            }
        }
        return changes;
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "GAME OVER!", Color.BLACK, 10);

    }

    private void setCellColoredNumber(int x, int y, int value) {
        String label = String.valueOf(value);
        if (value == 0) label = "";
       setCellValueEx(x, y, getColorByValue(value), label);
    }

    private Color getColorByValue(int value) {
        switch (value){
            case 0:
                return Color.LIGHTGREY;
            case 2:
                return Color.LIGHTYELLOW;
            case 4:
                return Color.LIGHTGREEN;
            case 8:
                return Color.LIGHTSALMON;
            case 16:
                return Color.ORANGE;
            case 32:
                return Color.LIGHTPINK;
            case 64:
                return Color.RED;
            case 128:
                return Color.YELLOW;
            case 256:
                return Color.YELLOWGREEN;
            case 512:
                return Color.LIGHTBLUE;
            case 1024:
                return Color.BLUE;
            case 2048:
                return Color.BLUEVIOLET;
            default:
                return Color.LIGHTGREY;
        }
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                createGame();
                drawScene();
            }
        } else {
            if (!canUserMove()) {
                gameOver();
            } else {
                if (key == Key.LEFT) {
                    moveLeft();
                    drawScene();
                } else if (key == Key.RIGHT) {
                    moveRight();
                    drawScene();
                } else if (key == Key.UP) {
                    moveUp();
                    drawScene();
                } else if (key == Key.DOWN) {
                    moveDown();
                    drawScene();
                }
            }
        }
    }

    private void rotateClockwise() {
        int n = SIDE;
        int[][] newField =  new int[n][n];
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int tmp = gameField[i][j];
                newField[i][j]=gameField[n-j-1][i];
                newField[n-j-1][i]=gameField[n-i-1][n-j-1];
                newField[n-i-1][n-j-1]=gameField[j][n-i-1];
                newField[j][n-i-1]=tmp;

            }
        }
        gameField = newField;
    }

    private  int getMaxTileValue() {
        int max = 0;
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (gameField[x][y] > max) {
                    max = gameField[x][y];
                }
            }
        }
        return max;
    }


    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }
    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();

    }
    private void moveLeft() {
        boolean isChanged = false;
        for (int i = 0; i < SIDE; i++) {
            if (compressRow(gameField[i])) {
                isChanged = true;
            }
            if (mergeRow(gameField[i])) {
                isChanged = true;
                compressRow(gameField[i]);
            }
        }

        if (isChanged) createNewNumber();
    }
    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

}
