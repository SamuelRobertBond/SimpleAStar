package com.bond.pathfinding.impl;

import com.bond.pathfinding.interfaces.AStarHeuristic;
import com.bond.pathfinding.interfaces.Mover;

public class ClosestHeuristic implements AStarHeuristic {

    public float getCost(Mover mover, int x, int y, int tx, int ty) {
        float dx = tx - x;
        float dy = ty - y;

        float result = (float) (Math.sqrt((dx*dx)+(dy*dy)));

        return result;
    }

}