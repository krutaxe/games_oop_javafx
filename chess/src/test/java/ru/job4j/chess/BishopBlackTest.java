package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Cell position = bishopBlack.position();
        assertThat(position, is(Cell.A3));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Figure copy = bishopBlack.copy(Cell.C1);
        assertThat(copy.position(), is(Cell.C1));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cell = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(cell, is(expected));
    }

    @Test
    public void wayTwo() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Cell[] cell = bishopBlack.way(Cell.F8);
        Cell[] expected = new Cell[] {Cell.B4, Cell.C5, Cell.D6, Cell.E7, Cell.F8};
        assertThat(cell, is(expected));
    }
}
