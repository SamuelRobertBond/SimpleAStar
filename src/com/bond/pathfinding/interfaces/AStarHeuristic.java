package com.bond.pathfinding.interfaces;

public interface AStarHeuristic {

    float getCost(Mover mover, int x, int y, int tx, int ty);

}
