package main.java.com.ticTacToe.model;

public class Board {
    private Cell[][] cells;

    public Board(int size) {
        cells = new Cell[size][size];
    }
}
