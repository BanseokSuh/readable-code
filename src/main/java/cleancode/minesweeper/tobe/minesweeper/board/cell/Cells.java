package cleancode.minesweeper.tobe.minesweeper.board.cell;

import java.util.Arrays;
import java.util.List;

/**
 * 일급 컬렉션
 */
public class Cells {

    private final List<Cell> cells;

    private Cells(List<Cell> cells) {
        this.cells = cells;
    }

    public static Cells of(List<Cell> cells) {
        return new Cells(cells);
    }

    public static Cells from(Cell[][] cells) {
        List<Cell> CellList = Arrays.stream(cells)
                .flatMap(Arrays::stream)
                .toList();
        return of(CellList);
    }

    public boolean isAllChecked() {
        return this.cells.stream()
                .allMatch(Cell::isChecked);
    }

}
