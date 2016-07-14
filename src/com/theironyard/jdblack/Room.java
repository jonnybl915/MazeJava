package com.theironyard.jdblack;

/**
 * Created by jonathandavidblack on 7/13/16.
 */
public class Room {
    int row;
    int col;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;
    boolean startRoom = false;

    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    public boolean isHasBottom() {
        return hasBottom;
    }

    public void setHasBottom(boolean hasBottom) {
        this.hasBottom = hasBottom;
    }

    public boolean isHasRight() {
        return hasRight;
    }

    public void setHasRight(boolean hasRight) {
        this.hasRight = hasRight;
    }

    public boolean isStartRoom() {
        return startRoom;
    }

    public void setStartRoom(boolean startRoom) {
        this.startRoom = startRoom;
    }
}
