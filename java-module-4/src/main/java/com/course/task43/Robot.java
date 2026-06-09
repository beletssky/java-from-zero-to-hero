package com.course.task43;

/**
 * Робот с координатами и направлением.
 * Умеет двигаться вперёд и поворачивать направо.
 */
public class Robot {
    private int x;
    private int y;
    private Direction facing;

    public Robot(int x, int y, Direction facing) {
        // TODO: реализуй
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public int getX() {
        // TODO: реализуй
        return x;
    }

    public int getY() {
        // TODO: реализуй
        return y;
    }

    public Direction getFacing() {
        // TODO: реализуй
        return facing;
    }

    public void move(int steps) {
        // TODO: реализуй
        switch (facing) {
            case EAST -> x += steps;
            case SOUTH -> y -= steps;
            case WEST -> x -= steps;
            case NORTH -> y += steps;
        }
    }

    public void turnRight() {
        // TODO: реализуй
        switch (facing) {
            case NORTH -> facing = Direction.EAST;
            case EAST -> facing = Direction.SOUTH;
            case SOUTH -> facing = Direction.WEST;
            case WEST -> facing = Direction.NORTH;
        }
    }
}
