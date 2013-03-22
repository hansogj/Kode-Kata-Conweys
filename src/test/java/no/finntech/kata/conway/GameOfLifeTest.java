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

    @Test
    public void AnyLiveCellWithNoNeighborShouldDie() {
        final boolean[][] initialGrid  = new boolean[][] {{false, false},{true, false}};
        final boolean[][] expectedGrid = new boolean[][] {{false, false},{false, false}};

        assertThat(GameOfLife.nextGeneration(initialGrid)).isEqualTo(expectedGrid);
    }

    @Test
    public void shouldStayAliveWhen2liveNeighbours() {
        final boolean[][] initialGrid  = new boolean[][] {{true, false, false},
                                                          {true, false, false},
                                                          {true, false, false}};
        final boolean[][] expectedGrid = new boolean[][] {{false, false, false},
                                                          {true, false, false},
                                                          {false, false, false}};

        assertThat(GameOfLife.nextGeneration(initialGrid)).isEqualTo(expectedGrid);
    }

}
