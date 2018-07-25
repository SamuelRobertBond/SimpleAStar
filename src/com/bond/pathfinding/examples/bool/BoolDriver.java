package com.bond.pathfinding.examples.bool;

import com.bond.pathfinding.impl.AStarPathfinder;
import com.bond.pathfinding.impl.ClosestHeuristic;
import com.bond.pathfinding.impl.Path;
import com.bond.pathfinding.interfaces.GameGrid;

public class BoolDriver {

    static boolean collisionGrid[][]= {
            {false, false, false, false, false},
            {true, true, true, false, true},
            {false, false, false, false, false},
            {false, true, true, true, true},
            {false, false, false, false, false},
    };

    public static void main(String args[]){



        GameGrid grid = new BooleanCollisionGrid(collisionGrid);
        AStarPathfinder pathfinder = new AStarPathfinder(grid, 15, false, new ClosestHeuristic());

        Path path = pathfinder.findPath(null, 0, 0, 4, 4);

        for(int i = 0; i < path.getLength(); ++i){
            System.out.println(path.getX(i) + ", " +  path.getY(i) + " -> ");
        }

    }

}
