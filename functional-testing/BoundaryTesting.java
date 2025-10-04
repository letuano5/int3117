import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoundaryTesting {

    private final Solver solver = new Solver();

    @Test
    void boundaryTesting() throws Exception {
        assertEquals(81, solver.countIntegerPointsInCircle(0.0, 0.0, 5.0));
        assertEquals(81, solver.countIntegerPointsInCircle(-10.0, 0.0, 5.0));
        assertEquals(81, solver.countIntegerPointsInCircle(10.0, 0.0, 5.0));
        assertEquals(74, solver.countIntegerPointsInCircle(-9.9999, 0.0, 5.0));
        assertEquals(74, solver.countIntegerPointsInCircle(9.9999, 0.0, 5.0));
        assertEquals(81, solver.countIntegerPointsInCircle(0.0, -10.0, 5.0));
        assertEquals(81, solver.countIntegerPointsInCircle(0.0, 10.0, 5.0));
        assertEquals(74, solver.countIntegerPointsInCircle(0.0, -9.9999, 5.0));
        assertEquals(74, solver.countIntegerPointsInCircle(0.0, 9.9999, 5.0));
        assertEquals(1, solver.countIntegerPointsInCircle(0.0, 0.0, 0.0));
        assertEquals(317, solver.countIntegerPointsInCircle(0.0, 0.0, 10.0));
        assertEquals(1, solver.countIntegerPointsInCircle(0.0, 0.0, 0.0001));
        assertEquals(305, solver.countIntegerPointsInCircle(0.0, 0.0, 9.9999));
    }
}