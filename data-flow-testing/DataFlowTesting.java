import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataFlowTesting {

    private final Solver solver = new Solver();

    @Test
    void dataFlowTesting() throws Exception {
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(-10.0001, 10.0001, -0.0001));
        assertEquals(5, solver.countIntegerPointsInCircle(0, 0, 1));
        assertEquals(1, solver.countIntegerPointsInCircle(0, 0, 0.0001));
    }
}