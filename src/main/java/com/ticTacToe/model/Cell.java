package main.java.com.ticTacToe.model;

public class Cell {
//    private int cellNo;
    private CellState state;
    private int xLocation;
    private int yLocation;

//    public Cell(int cellNo) {
//        this.cellNo = cellNo;
//        this.state = CellState.EMPTY;
//    }

    public Cell(int xLocation, int yLocation) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.state = CellState.EMPTY;
    }



}
