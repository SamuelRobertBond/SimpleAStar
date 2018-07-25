package com.bond.pathfinding.examples.bool;

import com.bond.pathfinding.interfaces.GameGrid;
import com.bond.pathfinding.interfaces.Mover;

public class BooleanCollisionGrid implements GameGrid {

    private boolean collisionMap[][];
    private boolean visited[][];

    public BooleanCollisionGrid(boolean collisionMap[][]) {

        this.collisionMap = collisionMap;
        this.visited = new boolean[getWidth()][getHeight()];

    }

    @Override
    public int getWidth() {
        return collisionMap.length;
    }

    @Override
    public int getHeight() {
        return collisionMap[0].length;
    }

    @Override
    public boolean blocked(Mover mover, int tx, int ty) {

        if(collisionMap[tx][ty]){
            return true;
        }
        return false;
    }

    @Override
    public boolean visited(int x, int y) {
        return visited[x][y];
    }

    @Override
    public void pathfinderVisited(int x, int y) {
        visited[x][y] = true;
    }

    @Override
    public void clearVisited() {
        for(int x = 0; x < getWidth(); ++x){
            for(int y = 0; y < getHeight(); ++y){
                visited[x][y] = false;
            }
        }
    }

    @Override
    public float getCost(Mover mover, int sx, int sy, int tx, int ty) {
        return 1;
    }
}
