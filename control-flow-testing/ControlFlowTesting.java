import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControlFlowTesting {

    private final Solver solver = new Solver();

    @Test
    void controlFlowTesting() throws Exception {
        assertThrows(Exception.class, () -> solver.countIntegerPointsInCircle(-10.0001, 10.0001, -0.0001));
        assertEquals(5, solver.countIntegerPointsInCircle(0, 0, 1));
    }
}