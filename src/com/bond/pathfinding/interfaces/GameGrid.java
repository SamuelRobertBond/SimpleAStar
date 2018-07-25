package com.bond.pathfinding.interfaces;

public interface GameGrid {

    int getWidth();
    int getHeight();

    boolean blocked(Mover mover, int tx, int ty);

    boolean visited(int x, int y);

    void pathfinderVisited(int x, int y);

    void clearVisited();

    float getCost(Mover mover, int sx, int sy, int tx, int ty);

}
