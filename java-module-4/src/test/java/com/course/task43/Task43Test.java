package com.course.task43;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task43Test {

    @Test
    void moveNorthIncreasesY() {
        Robot robot = new Robot(0, 0, Direction.NORTH);
        robot.move(5);
        assertEquals(0, robot.getX());
        assertEquals(5, robot.getY());
    }

    @Test
    void moveEastIncreasesX() {
        Robot robot = new Robot(0, 0, Direction.EAST);
        robot.move(3);
        assertEquals(3, robot.getX());
        assertEquals(0, robot.getY());
    }

    @Test
    void moveSouthDecreasesY() {
        Robot robot = new Robot(0, 0, Direction.SOUTH);
        robot.move(2);
        assertEquals(0, robot.getX());
        assertEquals(-2, robot.getY());
    }

    @Test
    void moveWestDecreasesX() {
        Robot robot = new Robot(0, 0, Direction.WEST);
        robot.move(4);
        assertEquals(-4, robot.getX());
        assertEquals(0, robot.getY());
    }

    @Test
    void turnRightCyclesThroughAllDirections() {
        Robot robot = new Robot(0, 0, Direction.NORTH);
        robot.turnRight();
        assertEquals(Direction.EAST, robot.getFacing());
        robot.turnRight();
        assertEquals(Direction.SOUTH, robot.getFacing());
        robot.turnRight();
        assertEquals(Direction.WEST, robot.getFacing());
        robot.turnRight();
        assertEquals(Direction.NORTH, robot.getFacing());
    }

    @Test
    void combinedMoveAndTurn() {
        Robot robot = new Robot(0, 0, Direction.NORTH);
        robot.move(2);
        robot.turnRight();
        robot.move(3);
        assertEquals(3, robot.getX());
        assertEquals(2, robot.getY());
        assertEquals(Direction.EAST, robot.getFacing());
    }
}
