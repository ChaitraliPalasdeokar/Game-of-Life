import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CellTest {

    @Test()
    void shouldReturnAllAliveNeighboursOfCell() {
        Cell cell=new Cell(1,1);
        List<Cell> initialGeneration=new ArrayList<>();
        initialGeneration.add(new Cell(0,0));
        initialGeneration.add(new Cell(1,1));
        List<Cell> expectedAliveNeighbours = new ArrayList<>();
        expectedAliveNeighbours.add(new Cell(0,0));

        List<Cell> actualAliveNeighbours=cell.getAllAliveNeighbours(initialGeneration);

        Assertions.assertEquals(expectedAliveNeighbours,actualAliveNeighbours);

    }

    @Test()
    void shouldReturnNeighboursOfCell() {
        Cell cell=new Cell(1,1);
        List<Cell> expectedNeighbours = new ArrayList<>();
        expectedNeighbours.add(new Cell(0,0));
        expectedNeighbours.add(new Cell(0,1));
        expectedNeighbours.add(new Cell(0,2));
        expectedNeighbours.add(new Cell(1,0));
        expectedNeighbours.add(new Cell(1,2));
        expectedNeighbours.add(new Cell(2,0));
        expectedNeighbours.add(new Cell(2,1));
        expectedNeighbours.add(new Cell(2,2));

        List<Cell> actualNeighbours=cell.getAllNeighbours();

        Assertions.assertEquals(expectedNeighbours,actualNeighbours);

    }


}
