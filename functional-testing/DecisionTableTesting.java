import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecisionTableTesting {

    private final Solver solver = new Solver();

    @Test
    void invalidInput() {
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(-10.0001, 0, 1));
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(10.0001, 0, 1));
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(0, -10.0001, 1));
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(0, 10.0001, 1));
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(0, 0, -0.0001));
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(0, 0, 10.0001));
    }

    @Test
    void validInput() throws Exception {
        assertEquals(78, solver.countIntegerPointsInCircle(7.4812, -5.9317, 4.9552));
    }
}