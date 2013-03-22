package no.finntech.kata.conway;

public final class GameOfLife {

    public static boolean[][] nextGeneration(boolean[][] grid) {
        final  boolean[][] result = new boolean[grid.length][grid[0].length];
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                //final int numberOfLiveNeighbours = getNumberOfLiveNeighbours(grid, x, y);
                result[x][y] = false;
            }
        }
        return result;
    }

    private static int getNumberOfLiveNeighbours(boolean[][] grid, int x, int y) {
        int result = 0;
        if (alive(grid, x-1, y-1)) result += 1;
        if (alive(grid, x-1, y)) result += 1;
        if (alive(grid, x-1, y+1)) result += 1;
        if (alive(grid, x, y-1)) result += 1;
        if (alive(grid, x, y+1)) result += 1;
        if (alive(grid, x+1, y-1)) result += 1;
        if (alive(grid, x+1, y)) result += 1;
        if (alive(grid, x+1, y+1)) result += 1;
        return result;
    }

    private static boolean alive(boolean[][] grid, int x, int y) {
        return exists(grid, x, y) && grid[x][y];
    }

    private static boolean exists(boolean[][] grid, int x, int y) {
        return (x>=0 && x <= grid.length && y >= 0 && y <= grid[x].length);
    }
}
