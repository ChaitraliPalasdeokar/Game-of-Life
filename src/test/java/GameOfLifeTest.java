import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class GameOfLifeTest {

    @Test()
    void shouldReturnNextGenerationForBlockPattern() {
        List<Cell> initialGeneration = new ArrayList<>();
        initialGeneration.add(new Cell(1, 1));
        initialGeneration.add(new Cell(1, 2));
        initialGeneration.add(new Cell(2, 1));
        initialGeneration.add(new Cell(2, 2));
        List<Cell> expectedNextGeneration = new ArrayList<>(initialGeneration);
        GameOfLife gameOfLife = new GameOfLife(initialGeneration);

        List<Cell> actualNextGeneration = gameOfLife.getNextGeneration();

        Assertions.assertEquals(expectedNextGeneration, actualNextGeneration);
    }


}
