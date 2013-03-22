package no.finntech.kata.conway;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public final class GameOfLifeTest {

    @Test
    public void emptyGridShouldRemainEmpty() {
        final boolean[][] initialGrid = new boolean[][] {{false}};
        final boolean[][] expectedGrid = new boolean[][] {{false}};

        assertThat(GameOfLife.nextGeneration(initialGrid)).isEqualTo(expectedGrid);
    }
}
