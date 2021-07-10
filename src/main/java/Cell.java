import java.util.Objects;

public class Cell {
    private final int xCordinate;
    private final int yCordinate;

    public Cell(int xCordinate, int yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
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
}
