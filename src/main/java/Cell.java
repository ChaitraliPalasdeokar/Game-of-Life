import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Cell {
    private final int xCordinate;
    private final int yCordinate;


    public Cell(int xCordinate, int yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }

    public List<Cell> getAllNeighbours() {
        List<Cell> neighbours = new ArrayList<>();
        for (int xcordinate = xCordinate - 1; xcordinate <= xCordinate + 1;
             xcordinate++) {
            for (int ycordinate = yCordinate - 1; ycordinate <= yCordinate + 1; ycordinate++) {
                if (xcordinate != xCordinate || ycordinate != yCordinate)
                    neighbours.add(new Cell(xcordinate, ycordinate));
            }
        }
        return neighbours;
    }

    public List<Cell> getAllAliveNeighbours(List<Cell> initialGeneration) {
        List<Cell> neighbours = getAllNeighbours();
        List<Cell> aliveNeighbours = new ArrayList<>();
        for (Cell cell : neighbours) {
            if (initialGeneration.contains(cell))
                aliveNeighbours.add(cell);
        }
        return aliveNeighbours;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return xCordinate == cell.xCordinate && yCordinate == cell.yCordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCordinate, yCordinate);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                '}';
    }

}
