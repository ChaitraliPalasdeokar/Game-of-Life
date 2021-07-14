import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
    public static final int MAX_NEIGHBOURS_TO_STAY_ALIVE = 3;
    public static final int MIN_NEIGHBOURS_TO_STAY_ALIVE = 2;
    private final List<Cell> initialGeneration;

    public GameOfLife(List<Cell> initialGeneration) {
        this.initialGeneration = initialGeneration;
    }

    public List<Cell> getNextGeneration() {
        List<Cell> nextGeneration = new ArrayList<>();

        addLiveCellsToNextGeneration(nextGeneration);
        addDeadCellThatComesToLife(nextGeneration);
        return nextGeneration;
    }

    private void addDeadCellThatComesToLife(List<Cell> nextGeneration) {

        for (Cell cell : initialGeneration) {
            List<Cell> allNeighbours = cell.getAllNeighbours();
            for (Cell neighbourcell : allNeighbours) {
                List<Cell> aliveNeigbours = neighbourcell.getAllAliveNeighbours(initialGeneration);
                if (aliveNeigbours.size() == MAX_NEIGHBOURS_TO_STAY_ALIVE && !nextGeneration.contains(neighbourcell)) {
                    nextGeneration.add(neighbourcell);
                }
            }
        }
    }

    private void addLiveCellsToNextGeneration(List<Cell> nextGeneration) {

        for (Cell cell : initialGeneration) {
            List<Cell> aliveNeighbours = cell.getAllAliveNeighbours(initialGeneration);
            if (aliveNeighbours.size() >= MIN_NEIGHBOURS_TO_STAY_ALIVE && aliveNeighbours.size() <= MAX_NEIGHBOURS_TO_STAY_ALIVE) {
                nextGeneration.add(cell);
                System.out.println(cell);
            }

        }
    }

}
